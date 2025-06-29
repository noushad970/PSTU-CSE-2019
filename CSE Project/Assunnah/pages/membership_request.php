<?php
session_start();
if (!isset($_SESSION['admin_logged_in']) || $_SESSION['admin_logged_in'] !== true) {
    header("Location: adminsignin.php");
    exit();
}

// DB connection
$host = 'localhost';
$user = 'root';
$pass = '';
$db = 'assunnah';
$conn = new mysqli($host, $user, $pass, $db);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Handle status update
if ($_SERVER["REQUEST_METHOD"] === "POST") {
    $email = $_POST['email'];
    $action = $_POST['action']; // "Accepted" or "Declined"

    $stmt = $conn->prepare("UPDATE membership_applications SET membership_status = ? WHERE email = ?");
    $stmt->bind_param("ss", $action, $email);
    $stmt->execute();
    $stmt->close();
}

// Fetch all pending requests
$result = $conn->query("SELECT * FROM membership_applications WHERE membership_status = 'pending'");
?>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Membership Requests</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(120deg, #4e54c8, #8f94fb);
            color: #fff;
            padding: 40px;
        }

        h2 {
            text-align: center;
            margin-bottom: 30px;
        }

        .card {
            background-color: rgba(255, 255, 255, 0.1);
            margin-bottom: 25px;
            padding: 20px;
            border-radius: 15px;
            box-shadow: 0 0 20px rgba(0,0,0,0.1);
        }

        .info p {
            margin: 8px 0;
        }

        .actions {
            margin-top: 15px;
        }

        .actions form {
            display: inline-block;
            margin-right: 10px;
        }

        .btn {
            padding: 8px 16px;
            font-weight: bold;
            color: white;
            border: none;
            border-radius: 8px;
            cursor: pointer;
        }

        .accept {
            background-color: #28a745;
        }

        .decline {
            background-color: #dc3545;
        }

        .back {
            display: block;
            margin-top: 30px;
            text-align: center;
            text-decoration: none;
            font-weight: bold;
            color: #ddd;
        }

        .back:hover {
            color: #fff;
        }
    </style>
</head>
<body>

<h2>Membership Requests (Pending)</h2>

<?php if ($result->num_rows > 0): ?>
    <?php while ($row = $result->fetch_assoc()): ?>
        <div class="card">
            <div class="info">
                <p><strong>Name:</strong> <?= htmlspecialchars($row['name']) ?></p>
                <p><strong>Father's Name:</strong> <?= htmlspecialchars($row['fathers_name']) ?></p>
                <p><strong>Phone:</strong> <?= htmlspecialchars($row['phone_number']) ?></p>
                <p><strong>Email:</strong> <?= htmlspecialchars($row['email']) ?></p>
                <p><strong>Member Type:</strong> <?= htmlspecialchars($row['member_type']) ?></p>
                <p><strong>Probashi:</strong> <?= $row['probashi'] ? 'Yes' : 'No' ?></p>
                <p><strong>Occupation:</strong> <?= htmlspecialchars($row['occupation']) ?></p>
                <p><strong>Reference:</strong> <?= htmlspecialchars($row['reference']) ?></p>
                <p><strong>Address:</strong> <?= htmlspecialchars($row['address']) ?></p>
                <p><strong>Donation Method:</strong> <?= htmlspecialchars($row['donation_payment_method']) ?></p>
                <p><strong>Status:</strong> <?= htmlspecialchars($row['membership_status']) ?></p>
            </div>

            <div class="actions">
                <form method="POST">
                    <input type="hidden" name="email" value="<?= htmlspecialchars($row['email']) ?>">
                    <input type="hidden" name="action" value="Accepted">
                    <button type="submit" class="btn accept">Accept</button>
                </form>
                <form method="POST">
                    <input type="hidden" name="email" value="<?= htmlspecialchars($row['email']) ?>">
                    <input type="hidden" name="action" value="Declined">
                    <button type="submit" class="btn decline">Decline</button>
                </form>
            </div>
        </div>
    <?php endwhile; ?>
<?php else: ?>
    <p style="text-align:center;">No pending membership requests found.</p>
<?php endif; ?>

<a class="back" href="adminPage.php">← Back to Dashboard</a>

</body>
</html>

<?php
$conn->close();
?>

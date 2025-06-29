<?php
session_start();
if (!isset($_SESSION['admin_logged_in']) || $_SESSION['admin_logged_in'] !== true) {
    header("Location: adminsignin.php");
    exit();
}

// DB Connection
$host = 'localhost';
$user = 'root';
$pass = '';
$db = 'assunnah';
$conn = new mysqli($host, $user, $pass, $db);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Handle form submission
if ($_SERVER["REQUEST_METHOD"] === "POST") {
    $email = $_POST['email'];
    $action = $_POST['action']; // "Accepted" or "Declined"

    $stmt = $conn->prepare("UPDATE volunteer_applications SET application_status = ? WHERE email = ?");
    $stmt->bind_param("ss", $action, $email);
    $stmt->execute();
    $stmt->close();
}

// Fetch all pending applications
$result = $conn->query("SELECT * FROM volunteer_applications WHERE application_status = 'pending'");
?>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Volunteer Requests</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(to right, #00c6ff, #0072ff);
            color: white;
            padding: 40px;
        }

        h2 {
            text-align: center;
            margin-bottom: 30px;
        }

        .card {
            background: rgba(255, 255, 255, 0.1);
            padding: 20px;
            border-radius: 15px;
            margin-bottom: 30px;
            box-shadow: 0 0 15px rgba(0,0,0,0.2);
        }

        .info p {
            margin: 6px 0;
        }

        .actions {
            margin-top: 15px;
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

<h2>Volunteer Requests (Pending)</h2>

<?php if ($result->num_rows > 0): ?>
    <?php while ($row = $result->fetch_assoc()): ?>
        <div class="card">
            <div class="info">
                <p><strong>Name:</strong> <?= htmlspecialchars($row['name']) ?></p>
                <p><strong>Email:</strong> <?= htmlspecialchars($row['email']) ?></p>
                <p><strong>Phone Number:</strong> <?= htmlspecialchars($row['phone_number']) ?></p>
                <p><strong>Emergency Phone:</strong> <?= htmlspecialchars($row['emergency_phone']) ?></p>
                <p><strong>Probashi:</strong> <?= $row['probashi'] ? 'Yes' : 'No' ?></p>
                <p><strong>Facebook:</strong> <a href="<?= htmlspecialchars($row['facebook_link']) ?>" style="color:lightblue;" target="_blank">Profile</a></p>
                <p><strong>NID:</strong> <?= htmlspecialchars($row['nid_number']) ?></p>
                <p><strong>Educational Info:</strong> <?= htmlspecialchars($row['educational_info']) ?></p>
                <p><strong>Occupation:</strong> <?= htmlspecialchars($row['occupation']) ?></p>
                <p><strong>Permanent Address:</strong> <?= htmlspecialchars($row['permanent_district_thana']) ?>, <?= htmlspecialchars($row['permanent_address']) ?></p>
                <p><strong>Present Address:</strong> <?= htmlspecialchars($row['present_district_thana']) ?>, <?= htmlspecialchars($row['present_address']) ?></p>
                <p><strong>Volunteering For:</strong> <?= htmlspecialchars($row['volunteer_for']) ?></p>
                <p><strong>Special Skills:</strong> <?= htmlspecialchars($row['special_skill']) ?></p>
                <p><strong>Status:</strong> <?= htmlspecialchars($row['application_status']) ?></p>
                <p><strong>Applied On:</strong> <?= htmlspecialchars($row['created_at']) ?></p>
            </div>

            <div class="actions">
                <form method="POST">
                    <input type="hidden" name="email" value="<?= htmlspecialchars($row['email']) ?>">
                    <input type="hidden" name="action" value="Accepted">
                    <button class="btn accept" type="submit">Accept</button>
                </form>
                <form method="POST">
                    <input type="hidden" name="email" value="<?= htmlspecialchars($row['email']) ?>">
                    <input type="hidden" name="action" value="Declined">
                    <button class="btn decline" type="submit">Decline</button>
                </form>
            </div>
        </div>
    <?php endwhile; ?>
<?php else: ?>
    <p style="text-align: center;">No pending volunteer applications found.</p>
<?php endif; ?>

<a class="back" href="adminPage.php">← Back to Dashboard</a>

</body>
</html>

<?php $conn->close(); ?>

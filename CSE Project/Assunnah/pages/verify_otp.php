<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Verify OTP - As-Sunnah Foundation</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f0;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }
        .header {
            background-color: #1a5c38;
            color: white;
            text-align: center;
            padding: 15px;
            font-size: 24px;
            font-weight: bold;
            width: 100%;
            position: fixed;
            top: 0;
        }
        .container {
            display: flex;
            margin-top: 70px;
            max-width: 400px;
            width: 100%;
        }
        .otp-section {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 100%;
            display: flex;
            flex-direction: column;
            justify-content: center;
        }
        .otp-section input {
            width: 100%;
            padding: 12px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
            height: 50px;
            box-sizing: border-box;
        }
        .otp-section button {
            background-color: #1a5c38;
            color: white;
            padding: 12px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            height: 50px;
            width: 100%;
        }
        .otp-section button:hover {
            background-color: #145f30;
        }
        @media (max-width: 600px) {
            .container {
                margin-top: 70px;
            }
        }
    </style>
</head>
<body>
    <div class="header">
        VERIFY OTP
    </div>

    <div class="container">
        <div class="otp-section">
            <form method="POST" action="">
                <input type="text" name="otp" placeholder="Enter OTP" required>
                <button type="submit" name="verify">Verify OTP</button>
            </form>
        </div>
    </div>

    <?php
    session_start();

    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "assunnah";

    $conn = new mysqli($servername, $username, $password, $dbname);

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    $email = $_SESSION['email'] ?? '';

    if (isset($_POST['verify'])) {
        $otp = $_POST['otp'];

        // Check OTP
        $stmt = $conn->prepare("SELECT otp, otp_expiry FROM temp_otp WHERE email = ?");
        $stmt->bind_param("s", $email);
        $stmt->execute();
        $result = $stmt->get_result();

        if ($result->num_rows > 0) {
            $row = $result->fetch_assoc();
            $stored_otp = $row['otp'];
            $otp_expiry = $row['otp_expiry'];

            if ($otp === $stored_otp && strtotime($otp_expiry) > time()) {
                // OTP is valid and not expired
                echo "<p style='color:green;text-align:center;'>OTP verified successfully! Redirecting...</p>";
                // Redirect to profile page
                header("Location: index.php");
                exit();
            } elseif (strtotime($otp_expiry) <= time()) {
                echo "<p style='color:red;text-align:center;'>OTP has expired. Please request a new one.</p>";
            } else {
                echo "<p style='color:red;text-align:center;'>Invalid OTP. Please try again.</p>";
            }
        } else {
            echo "<p style='color:red;text-align:center;'>No OTP found for this email.</p>";
        }
        $stmt->close();
    }

    $conn->close();
    ?>
</body>
</html>
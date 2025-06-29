

<?php include '../includes/header.php'; ?>
<head>
    <style>
        body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f4f4f4;
}
        .head {
    background-color: #008e48;
    color: white;
    text-align: center; font-size: 34px;font-weight: bold;
    padding: 1em;
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
            max-width: 800px;
            width: 100%;
        }
        .left-section {
            background-color: #1a5c38;
            color: white;
            padding: 20px;
            border-radius: 10px 0 0 10px;
            flex: 1;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            text-align: center;
        }
        .left-section img {
            max-width: 150px;
            margin-bottom: 20px;
        }
        .left-section p {
            margin: 10px 0;
            font-size: 16px;
        }
        .right-section {
            background-color: white;
            padding: 20px;
            border-radius: 0 10px 10px 0;
            flex: 1;
            display: flex;
            flex-direction: column;
            justify-content: center;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .right-section input {
            width: 100%;
            padding: 12px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
            height: 50px;
            box-sizing: border-box;
        }
        .right-section button {
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
        .right-section button:hover {
            background-color: #145f30;
        }
        @media (max-width: 600px) {
            .container {
                flex-direction: column;
                margin-top: 70px;
            }
            .left-section, .right-section {
                border-radius: 10px;
                max-width: 100%;
            }
        }
    </style>
</head>
<body>
    <div class="head">
        SIGN IN
    </div>

    <div class="container">
        <!-- Left Section with Image and Text -->
        <div>
            <img src="../assets/images/signin.jpg.png" alt="As-Sunnah Foundation Logo" >
            
        </div>

        <!-- Right Section with Form -->
        <div class="right-section">
            <form method="POST" action="verify_otp.php">
                <input type="email" name="email" placeholder="Enter your email" value="<?php echo isset($_POST['email']) ? htmlspecialchars($_POST['email']) : ''; ?>" required>
                <button type="submit" name="get_otp">Get OTP</button>
            </form>
        </div>
    </div>

    <?php
  

    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "assunnah";

    $conn = new mysqli($servername, $username, $password, $dbname);

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    if (isset($_POST['get_otp'])) {
        $email = $_POST['email'];

        // Check if email exists in membership_applications
        $stmt = $conn->prepare("SELECT email FROM membership_applications WHERE email = ?");
        $stmt->bind_param("s", $email);
        $stmt->execute();
        $result = $stmt->get_result();

        if ($result->num_rows > 0) {
            $otp = rand(100000, 999999);
            $otp_expiry = date('Y-m-d H:i:s', strtotime('+5 minutes')); // OTP valid for 5 minutes

            // Store OTP in a temporary table or session (for this example, using a temporary table)
            $sql = "CREATE TABLE IF NOT EXISTS temp_otp (
                id INT AUTO_INCREMENT PRIMARY KEY,
                email VARCHAR(100),
                otp VARCHAR(6),
                otp_expiry TIMESTAMP
            )";
            $conn->query($sql);

            $stmt = $conn->prepare("INSERT INTO temp_otp (email, otp, otp_expiry) VALUES (?, ?, ?) ON DUPLICATE KEY UPDATE otp = ?, otp_expiry = ?");
            $stmt->bind_param("sssss", $email, $otp, $otp_expiry, $otp, $otp_expiry);
            if ($stmt->execute()) {
                // Simulate OTP sending (replace with real email service)
                echo "<p style='color:green;text-align:center;'>OTP sent to $email. Valid for 5 minutes.</p>";
                $_SESSION['email'] = $email;
                // Redirect to OTP verification page
                header("Location: verify_otp.php");
                exit();
            } else {
                echo "<p style='color:red;text-align:center;'>Error generating OTP.</p>";
            }
        } else {
            echo "<p style='color:red;text-align:center;'>Email not found in membership_applications.</p>";
        }
        $stmt->close();
    }

    $conn->close();
    ?>
</body>


<?php include '../includes/footer.php'; ?>
<?php include '../includes/header.php'; ?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact - As-Sunnah Foundation</title>
    
</head>
<body>
    <div class="head">
        CONTACT US
    </div>
    <?php
    if (isset($_POST['submit'])) {
        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "assunnah";

        $conn = new mysqli($servername, $username, $password, $dbname);

        if ($conn->connect_error) {
            echo "<p style='color:red;text-align:center;'>Connection failed: " . $conn->connect_error . "</p>";
        } else {
            // Create table if it doesn't exist
            $sql = "CREATE TABLE IF NOT EXISTS contact_submissions (
                id INT AUTO_INCREMENT PRIMARY KEY,
                name VARCHAR(100),
                email VARCHAR(100),
                subject VARCHAR(150),
                message TEXT,
                submission_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
            )";

            if ($conn->query($sql) === TRUE) {
                // Prepare and bind
                $stmt = $conn->prepare("INSERT INTO contact_submissions (name, email, subject, message) VALUES (?, ?, ?, ?)");
                $stmt->bind_param("ssss", $name, $email, $subject, $message);

                // Set parameters
                $name = $_POST['name'];
                $email = $_POST['email'];
                $subject = $_POST['subject'];
                $message = $_POST['message'];

                // Execute
                if ($stmt->execute()) {
                    echo "<p style='color:green;text-align:center;'>Message submitted successfully!</p>";
                } else {
                    echo "<p style='color:red;text-align:center;'>Error: " . $conn->error . "</p>";
                }

                $stmt->close();
            } else {
                echo "<p style='color:red;text-align:center;'>Error creating table: " . $conn->error . "</p>";
            }

            $conn->close();
        }
    }
    ?>
    <div class="container">
        <!-- Contact Form Section -->
        <div class="form-section">
            <h2>Contact Form</h2>
            <form method="POST" action="">
                <label class="required">Your Name:</label>
                <input type="text" name="name" required>

                <label class="required">Your Email:</label>
                <input type="email" name="email" required>

                <label class="required">Subject:</label>
                <input type="text" name="subject" required>

                <label class="required">Message:</label>
                <textarea name="message" required></textarea>

                <button type="submit" name="submit">Submit</button>
            </form>
        </div>

        <!-- Map Section with Live Map -->
        <div class="map-section">
            <h2>Where Are We?</h2>
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3652.333198789122!2d90.37167107419824!3d23.73569317867689!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3755b97a59e9f32d%3A0x7a7b1b1b1b1b1b1b!2sAs-Sunnah%20Foundation!5e0!3m2!1sen!2sbd!4v1698754321987!5m2!1sen!2sbd" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
        </div>
    </div>

    
    
<link rel="stylesheet" href="../assets/css/contact.css">
</body>
</html>
<?php include '../includes/footer.php'; ?>
<?php include '../includes/header.php'; ?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gallery - As-Sunnah Foundation</title>
   
</head>
<body>
    <div class="head">
        GALLERY
    </div>

    <div class="container">
        <!-- Sidebar with Image Titles -->
        <div class="sidebar">
            <ul>
                <?php
                $servername = "localhost";
                $username = "root";
                $password = "";
                $dbname = "assunnah";

                $conn = new mysqli($servername, $username, $password, $dbname);

                if ($conn->connect_error) {
                    die("Connection failed: " . $conn->connect_error);
                }

                // Create table if it doesn't exist
                $sql = "CREATE TABLE IF NOT EXISTS gallery (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    image_title VARCHAR(100),
                    image VARCHAR(255)
                )";
                $conn->query($sql);

                // Fetch unique image titles
                $sql = "SELECT DISTINCT image_title FROM gallery ORDER BY image_title";
                $result = $conn->query($sql);

                $selected_title = isset($_GET['title']) ? $_GET['title'] : ($result->num_rows > 0 ? $result->fetch_assoc()['image_title'] : '');

                if ($result->num_rows > 0) {
                    $result->data_seek(0); // Reset pointer
                    while ($row = $result->fetch_assoc()) {
                        $title = $row['image_title'];
                        $is_active = ($title === $selected_title) ? 'active' : '';
                        echo "<li><button class='$is_active' onclick=\"window.location.href='?title=" . urlencode($title) . "'\">$title</button></li>";
                    }
                } else {
                    echo "<li>No categories available.</li>";
                }
                ?>
            </ul>
        </div>

        <!-- Gallery Section -->
        <div class="gallery-section">
            <?php
            if ($selected_title) {
                // Fetch images for the selected title
                $stmt = $conn->prepare("SELECT image FROM gallery WHERE image_title = ?");
                $stmt->bind_param("s", $selected_title);
                $stmt->execute();
                $result = $stmt->get_result();

                if ($result->num_rows > 0) {
                    while ($row = $result->fetch_assoc()) {
                        $image_name = $row['image'];
                        // Construct image path (assuming images are in 'images' folder)
                        $image_path = "../assets/images/" . $image_name;
                        echo "<img src='$image_path' alt='$selected_title'>";
                    }
                } else {
                    echo "<p>No images available for this category.</p>";
                }

                $stmt->close();
            } else {
                echo "<p>Please select a category to view images.</p>";
            }

            $conn->close();
            ?>
        </div>
    </div>

</body>
</html>

<link rel="stylesheet" href="../assets/css/gallery.css">
<?php include '../includes/footer.php'; ?>
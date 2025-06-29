<?php include '../includes/header.php'; ?>
<?php
// Database connection
$servername = "localhost";
$username = "root"; // Replace with your MySQL username
$password = ""; // Replace with your MySQL password
$dbname = "assunnah";

$conn = new mysqli($servername, $username, $password, $dbname);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Fetch projects
$sql = "SELECT title, description FROM projects";
$result = $conn->query($sql);
$projects = [];
if ($result->num_rows > 0) {
    while ($row = $result->fetch_assoc()) {
        $projects[$row['title']] = $row['description'];
    }
}
$conn->close();

// Default project to display (first project in the list)
$default_project = !empty($projects) ? array_key_first($projects) : "";
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Projects - As-Sunnah Foundation</title>
    
</head>
<body>
    <div class="head">
        <h1>PROJECTS</h1>
</div>

    <div class="container">
        <div class="sidebar">
            <?php foreach (array_keys($projects) as $project) { ?>
                <button class="<?php echo ($default_project === $project) ? 'active' : ''; ?>" onclick="showProject('<?php echo htmlspecialchars($project); ?>')"><?php echo htmlspecialchars($project); ?></button>
            <?php } ?>
        </div>
        <div class="content" id="contentArea">
            <?php if ($default_project) { ?>
                <h2><?php echo htmlspecialchars($default_project); ?></h2>
                <?php echo nl2br(htmlspecialchars($projects[$default_project])); ?>
            <?php } else { echo "No projects found."; } ?>
        </div>
    </div>

    <script>
        function showProject(project) {
            const contentArea = document.getElementById('contentArea');
            const buttons = document.querySelectorAll('.sidebar button');
            
            // Remove active class from all buttons
            buttons.forEach(btn => btn.classList.remove('active'));
            // Add active class to the clicked button
            buttons.forEach(btn => {
                if (btn.textContent === project) {
                    btn.classList.add('active');
                }
            });

            <?php
            foreach ($projects as $key => $value) {
                echo "if (project === '" . htmlspecialchars($key) . "') contentArea.innerHTML = `<h2>" . htmlspecialchars($key) . "</h2>" . addslashes(nl2br(htmlspecialchars($value))) . "`;\n";
            }
            ?>
        }
    </script>
</body>
</html>
<link rel="stylesheet" href="../assets/css/projects.css">
<?php include '../includes/footer.php'; ?>
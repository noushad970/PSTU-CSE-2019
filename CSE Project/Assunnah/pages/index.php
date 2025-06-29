<!-- index.php -->
<?php include '../includes/header.php'; ?>

<!-- donation box -->
<div class="donation-box">
    <form action="donate.php" method="POST">
        <select name="category" required>
            <option value="">Select Donation Category</option>
            <option value="Donate Old People">Donate Old People</option>
            <option value="Donate Poor People">Donate Poor People</option>
            <option value="Donate Autisms">Donate Autisms</option>
            <option value="Donate Jobless People">Donate Jobless People</option>
            <option value="Donate for Festival">Donate for Festival</option>
        </select>

        <input type="text" name="donator_number" placeholder="Your Phone Number" required>

        <input type="number" name="amount" placeholder="Amount to Donate (BDT)" required>

        <button type="submit">Donate with SSLCommerz</button>
    </form>
</div>
<!-- images slider -->
<div class="slider-box">
    <div class="slider">
        <img src="../assets/images/image1.jpg" alt="Slide 1">
        <img src="../assets/images/image2.jpg" alt="Slide 2">
        <img src="../assets/images/image3.jpg" alt="Slide 3">
        <img src="../assets/images/image4.jpg" alt="Slide 4">
        <img src="../assets/images/image5.jpg" alt="Slide 5">
        <img src="../assets/images/image6.jpg" alt="Slide 6">
        <img src="../assets/images/image7.jpg" alt="Slide 7">
    </div>
</div>

<link rel="stylesheet" href="../assets/css/home.css">
<script src="../assets/js/home.js"></script>


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

// Fetch ongoing projects
$sql = "SELECT title, description FROM ongoing_project";
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
    <title>Ongoing Projects - As-Sunnah Foundation</title>
    
 
</head>
<body>
    <div class ="head">
        <h1>ONGOING PROJECTS</h1>
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
            <?php } else { echo "No ongoing projects found."; } ?>
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
<link rel="stylesheet" href="../assets/css/ongoing_project.css">

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
<?php
// Define content for each section
$sections = [
    "Introduction" => "As-Sunnah Foundation is a non-political, non-profitable government-registered organization dedicated to education, da'wah and full human welfare. It was established in 2017 by Shaikh Ahmadullah. He is the chairman of the organization and manages it directly. As-Sunnah Foundation was registered in 2019 from Joint Stock, whose registration number is S-13111/2019. Since then, it has been working rigorously to serve the humanity, reform the society, developing the utmost morality, arrange various activities to build up a neat and clean mentality and ultimately to build up an ideal society following in the footsteps of the Prophet Muhammad, the teacher of humanity, the messenger of human liberation and peace and the ideal of human welfare.",
    "Principles and Norms" => "One of the goals of As-Sunnah Foundation is to build life and society based on the Qur'an and Sunnah and to propagate and spread authentic knowledge. It is our policy to adopt a moderate approach based on the Qur'an and Sunnah following the path of righteous predecessors.",
    "Goals and Objectives" => "The ultimate goal of As-Sunnah Foundation is to serve humanity and promote a society rooted in Islamic values, education, and welfare.",
    "Activities" => "As-Sunnah Foundation organizes various educational programs, charity events, and community welfare initiatives to support the underprivileged and spread awareness.",
    "Sources of funds and income" => "The foundation relies on donations, grants, and community contributions to fund its activities.",
    "Expenditure policy" => "All funds are utilized transparently to maximize the impact on community welfare projects.",
    "Achievements" => "As-Sunnah Foundation has successfully conducted numerous relief operations and educational programs since its inception."
];

$default_section = "Introduction";
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About As-Sunnah Foundation</title>
    
</head>
<body>
<div class="head">
    <h1>ABOUT</h1>
</div>

<div class="container">
    <div class="sidebar">
        <?php foreach (array_keys($sections) as $section) { ?>
            <button onclick="showSection('<?php echo $section; ?>', this)" <?php if ($section === $default_section) echo 'class="active"'; ?>>
                <?php echo $section; ?>
            </button>
        <?php } ?>
    </div>
    
    <div class="content" id="contentArea">
        <h2><?php echo $default_section; ?></h2>
        <p><?php echo nl2br(htmlspecialchars($sections[$default_section])); ?></p>
    </div>
</div>

<link rel="stylesheet" href="../assets/css/about.css">
<script>
    function showSection(section, btn) {
        const contentArea = document.getElementById('contentArea');
        const buttons = document.querySelectorAll('.sidebar button');

        // Remove 'active' class from all buttons
        buttons.forEach(button => button.classList.remove('active'));

        // Add 'active' class to the clicked button
        btn.classList.add('active');

        <?php
        foreach ($sections as $key => $value) {
            $escapedContent = addslashes(nl2br(htmlspecialchars($value)));
            echo "if (section === '$key') contentArea.innerHTML = `<h2>$key</h2><p>$escapedContent</p>`;\n";
        }
        ?>
    }
</script>
</body>
</html>

<?php include '../includes/footer.php'; ?>



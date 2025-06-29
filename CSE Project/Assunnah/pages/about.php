<?php include '../includes/header.php'; ?>
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

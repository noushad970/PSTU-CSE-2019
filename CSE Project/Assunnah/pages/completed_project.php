<?php
session_start();

if (!isset($_SESSION['admin_logged_in']) || $_SESSION['admin_logged_in'] !== true) {
    header("Location: adminsignin.php");
    exit();
}

// DB connection info
$host = 'localhost';
$user = 'root';
$pass = '';
$db = 'assunnah';

// Connect to DB
$conn = new mysqli($host, $user, $pass, $db);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Handle new project addition
$add_message = '';
if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST['add_project'])) {
    $title = trim($_POST['title']);
    $description = trim($_POST['description']);
    if ($title === '') {
        $add_message = "❌ Title cannot be empty.";
    } else {
        $stmt = $conn->prepare("INSERT INTO projects (title, description) VALUES (?, ?)");
        $stmt->bind_param("ss", $title, $description);
        if ($stmt->execute()) {
            $add_message = "✅ Project added successfully.";
        } else {
            $add_message = "❌ Error adding project.";
        }
        $stmt->close();
    }
}

// Handle deletion
if (isset($_GET['delete_id'])) {
    $delete_id = intval($_GET['delete_id']);
    $stmt = $conn->prepare("DELETE FROM projects WHERE id = ?");
    $stmt->bind_param("i", $delete_id);
    $stmt->execute();
    $stmt->close();
    header("Location: ongoing_project.php"); // refresh to avoid resubmission
    exit();
}

// Fetch all projects
$result = $conn->query("SELECT * FROM projects ORDER BY id DESC");
?>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Ongoing Projects</title>
<style>
  @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap');

  body {
    margin: 0;
    font-family: 'Poppins', sans-serif;
    background: linear-gradient(135deg, #667eea, #764ba2);
    color: white;
    min-height: 100vh;
    padding: 40px 20px;
  }

  h1 {
    font-weight: 600;
    text-align: center;
    margin-bottom: 30px;
  }

  .container {
    max-width: 900px;
    margin: 0 auto;
    background: rgba(255,255,255,0.12);
    padding: 30px;
    border-radius: 15px;
    box-shadow: 0 10px 30px rgba(0,0,0,0.2);
  }

  form.add-project {
    display: flex;
    gap: 15px;
    margin-bottom: 25px;
    flex-wrap: wrap;
  }

  form.add-project input[type="text"],
  form.add-project textarea {
    flex: 1 1 200px;
    padding: 10px 15px;
    border-radius: 8px;
    border: none;
    font-size: 1rem;
    outline: none;
  }

  form.add-project textarea {
    resize: vertical;
    min-height: 50px;
  }

  form.add-project button {
    background: #6b46c1;
    border: none;
    color: white;
    font-weight: 600;
    padding: 12px 25px;
    border-radius: 10px;
    cursor: pointer;
    transition: background 0.3s ease;
  }

  form.add-project button:hover {
    background: #553c9a;
  }

  .message {
    text-align: center;
    margin-bottom: 15px;
    font-weight: 600;
  }

  .message.success {
    color: #6eea6b;
  }

  .message.error {
    color: #ff6b6b;
  }

  table {
    width: 100%;
    border-collapse: collapse;
    background: rgba(0,0,0,0.2);
    border-radius: 10px;
    overflow: hidden;
  }

  thead {
    background: #553c9a;
  }

  th, td {
    padding: 12px 15px;
    text-align: left;
  }

  tr:nth-child(even) {
    background: rgba(255,255,255,0.05);
  }

  button.delete-btn {
    background: #e04f5f;
    border: none;
    color: white;
    padding: 8px 15px;
    border-radius: 8px;
    cursor: pointer;
    font-weight: 600;
    transition: background 0.3s ease;
  }

  button.delete-btn:hover {
    background: #b02a39;
  }

  a.back-dashboard {
    display: inline-block;
    margin-top: 20px;
    color: #cfcfff;
    text-decoration: none;
    font-weight: 600;
    transition: color 0.3s ease;
  }

  a.back-dashboard:hover {
    color: white;
  }
</style>
</head>
<body>

<div class="container">
  <h1>Ongoing Projects</h1>

  <?php if ($add_message): ?>
    <p class="message <?php echo strpos($add_message, '✅') === 0 ? 'success' : 'error'; ?>">
      <?php echo htmlspecialchars($add_message); ?>
    </p>
  <?php endif; ?>

  <form class="add-project" method="POST" action="ongoing_project.php">
    <input type="text" name="title" placeholder="Project Title" required />
    <textarea name="description" placeholder="Project Description"></textarea>
    <button type="submit" name="add_project">Add Project</button>
  </form>

  <table>
    <thead>
      <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Description</th>
        <th>Delete</th>
      </tr>
    </thead>
    <tbody>
      <?php if ($result && $result->num_rows > 0): ?>
        <?php while ($row = $result->fetch_assoc()): ?>
          <tr>
            <td><?php echo htmlspecialchars($row['id']); ?></td>
            <td><?php echo htmlspecialchars($row['title']); ?></td>
            <td><?php echo nl2br(htmlspecialchars($row['description'])); ?></td>
            <td>
              <form method="GET" onsubmit="return confirm('Are you sure you want to delete this project?');" style="margin:0;">
                <input type="hidden" name="delete_id" value="<?php echo $row['id']; ?>">
                <button type="submit" class="delete-btn">Delete</button>
              </form>
            </td>
          </tr>
        <?php endwhile; ?>
      <?php else: ?>
        <tr>
          <td colspan="4" style="text-align:center;">No projects found.</td>
        </tr>
      <?php endif; ?>
    </tbody>
  </table>

  <a href="adminPage.php" class="back-dashboard">← Back to Dashboard</a>
</div>

</body>
</html>

<?php
$conn->close();
?>

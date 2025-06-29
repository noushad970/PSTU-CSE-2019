<?php
session_start();

if (!isset($_SESSION['admin_logged_in']) || $_SESSION['admin_logged_in'] !== true) {
    header("Location: adminsignin.php");
    exit();
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Admin Dashboard</title>
<style>
  @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap');

  body {
    margin: 0;
    font-family: 'Poppins', sans-serif;
    background: linear-gradient(135deg, #667eea, #764ba2);
    min-height: 100vh;
    display: flex;
    flex-direction: column;
    align-items: center;
    color: white;
    overflow-x: hidden;
  }

  header {
    width: 100%;
    background: rgba(255,255,255,0.1);
    padding: 20px 40px;
    box-shadow: 0 2px 12px rgba(0,0,0,0.3);
    display: flex;
    justify-content: space-between;
    align-items: center;
    animation: slideDown 1s ease forwards;
  }

  header h1 {
    margin: 0;
    font-weight: 600;
  }

  button.logout {
    background: #6b46c1;
    border: none;
    color: white;
    padding: 10px 20px;
    border-radius: 8px;
    font-weight: 600;
    cursor: pointer;
    transition: background 0.3s ease;
  }

  button.logout:hover {
    background: #553c9a;
  }

  main {
    flex: 1;
    width: 90%;
    max-width: 900px;
    margin: 40px 0;
    background: rgba(255, 255, 255, 0.12);
    border-radius: 15px;
    padding: 30px;
    box-shadow: 0 10px 30px rgba(0,0,0,0.2);
    animation: fadeInUp 1s ease forwards;
  }

  main h2 {
    margin-top: 0;
    font-weight: 600;
    margin-bottom: 20px;
    text-align: center;
  }

  .button-grid {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(180px, 1fr));
    gap: 20px;
    margin-top: 30px;
  }

  .btn {
    background: #6b46c1;
    border: none;
    padding: 15px 20px;
    border-radius: 12px;
    font-weight: 600;
    font-size: 1.1rem;
    color: white;
    cursor: pointer;
    transition: background 0.3s ease;
    text-align: center;
    text-decoration: none;
    display: inline-block;
  }

  .btn:hover {
    background: #553c9a;
  }

  /* Animations */
  @keyframes slideDown {
    0% {
      opacity: 0;
      transform: translateY(-50px);
    }
    100% {
      opacity: 1;
      transform: translateY(0);
    }
  }

  @keyframes fadeInUp {
    0% {
      opacity: 0;
      transform: translateY(30px);
    }
    100% {
      opacity: 1;
      transform: translateY(0);
    }
  }
</style>
</head>
<body>

<header>
  <h1>Welcome, <?php echo htmlspecialchars($_SESSION['admin_id']); ?></h1>
  <form method="POST" action="logoutAdmin.php" style="margin:0;">
    <button type="submit" class="logout">Logout</button>
  </form>
</header>

<main>
  <h2>Admin Dashboard</h2>
  <div class="button-grid">
    <a href="completed_project.php" class="btn">Completed Project</a>
    <a href="ongoing_project_admin.php" class="btn">Ongoing Project</a>
    <a href="membership_request.php" class="btn">Membership Request</a>
    <a href="volunteer_request_admin.php" class="btn">Volunteer Request</a>
    <a href="donate_collection.php" class="btn">Payment Details</a>
  </div>
</main>

</body>
</html>

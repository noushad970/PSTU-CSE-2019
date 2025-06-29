<?php
session_start();
require '../includes/db_connect.php';

$message = '';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $admin_id = $_POST['admin_id'];
    $password = $_POST['password'];

    $stmt = $conn->prepare("SELECT * FROM admin_users WHERE admin_id = ?");
    $stmt->bind_param("s", $admin_id);
    $stmt->execute();
    $result = $stmt->get_result();

    if ($row = $result->fetch_assoc()) {
        if ($password === $row['password']) {
            $_SESSION['admin_logged_in'] = true;
            $_SESSION['admin_id'] = $row['admin_id'];
            header("Location: adminPage.php");
            exit();
        } else {
            $message = "❌ Incorrect password.";
        }
    } else {
        $message = "❌ Admin ID not found.";
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Admin Login</title>
<style>
  @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap');

  /* Reset & basics */
  * {
    box-sizing: border-box;
  }
  body {
    margin: 0;
    height: 100vh;
    background: linear-gradient(135deg, #667eea, #764ba2);
    font-family: 'Poppins', sans-serif;
    display: flex;
    justify-content: center;
    align-items: center;
    color: #fff;
    overflow: hidden;
  }

  .login-container {
    background: rgba(255,255,255,0.1);
    padding: 40px 50px;
    border-radius: 12px;
    width: 360px;
    box-shadow: 0 8px 24px rgba(0,0,0,0.3);
    animation: fadeInDown 0.8s ease forwards;
  }

  h2 {
    margin: 0 0 30px 0;
    font-weight: 600;
    text-align: center;
    letter-spacing: 1px;
  }

  label {
    display: block;
    margin-bottom: 8px;
    font-weight: 500;
  }

  input[type="text"],
  input[type="password"] {
    width: 100%;
    padding: 12px 15px;
    border-radius: 8px;
    border: none;
    margin-bottom: 20px;
    font-size: 1rem;
    outline: none;
    transition: box-shadow 0.3s ease;
  }

  input[type="text"]:focus,
  input[type="password"]:focus {
    box-shadow: 0 0 8px 2px #a78bfa;
  }

  input[type="submit"] {
    width: 100%;
    padding: 14px;
    border: none;
    border-radius: 8px;
    background: #6b46c1;
    color: white;
    font-weight: 600;
    font-size: 1rem;
    cursor: pointer;
    transition: background 0.3s ease;
  }

  input[type="submit"]:hover {
    background: #553c9a;
  }

  .message {
    text-align: center;
    font-weight: 600;
    margin-top: 15px;
    animation: fadeIn 0.6s ease forwards;
    color: #ff6b6b;
  }

  /* Animations */
  @keyframes fadeInDown {
    0% {
      opacity: 0;
      transform: translateY(-40px);
    }
    100% {
      opacity: 1;
      transform: translateY(0);
    }
  }

  @keyframes fadeIn {
    from {opacity: 0;}
    to {opacity: 1;}
  }
</style>
</head>
<body>

<div class="login-container">
    <h2>Admin Sign-In</h2>
    <form method="POST">
        <label for="admin_id">Admin ID:</label>
        <input type="text" id="admin_id" name="admin_id" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <input type="submit" value="Sign In">
    </form>

    <?php if ($message): ?>
      <p class="message"><?php echo htmlspecialchars($message); ?></p>
    <?php endif; ?>
</div>

</body>
</html>

<?php
$host = 'localhost';
$user = 'root';
$pass = '';
$db   = 'assunnah';

$conn = new mysqli($host, $user, $pass, $db);

if ($conn->connect_error) {
    die("❌ Database connection failed: " . $conn->connect_error);
}
?>

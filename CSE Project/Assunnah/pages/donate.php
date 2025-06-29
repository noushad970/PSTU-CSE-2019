<?php
// donate.php
// Include database connection at the top
require_once __DIR__ . '/../includes/db_connect.php';
if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['category'])) {
    $category = $conn->real_escape_string($_POST['category']);
    $donator_number = $conn->real_escape_string($_POST['donator_number']);
    $amount = $conn->real_escape_string($_POST['amount']);
    error_log("Donation amount: " . $amount); // Debug log
    // Rest of the code...
    $payment_status = 'Pending';
    $tran_id = "SSLCZ_TEST_" . uniqid();

    $sql = "INSERT INTO donations (category, donator_number, amount, payment_status, tran_id) 
            VALUES ('$category', '$donator_number', '$amount', '$payment_status', '$tran_id')";

    if ($conn->query($sql)) {
        // Redirect to payment page
        header("Location: ../payment/payment.php?amount=" . urlencode($amount) . "&tran_id=" . urlencode($tran_id));
        exit; // Ensure script stops after redirect
    } else {
        $error = "Error: " . $conn->error;
    }
    $conn->close();
}


// Include header after logic (if it contains output)
include '../includes/header.php';
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Donate - As-Sunnah Foundation</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f0;
        }
        .head {
            background-color: #008e48;
            color: white;
            text-align: center;
            font-size: 34px;
            font-weight: bold;
            padding: 1em;
        }
        .container {
            display: flex;
            justify-content: center;
            padding: 20px;
            flex-wrap: wrap;
            gap: 20px;
        }
        .donation-card {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }
        .donation-card img {
            max-width: 100%;
            height: auto;
            margin-bottom: 15px;
        }
        .donation-card h3 {
            color: #1a5c38;
            margin-bottom: 10px;
        }
        .donation-card p {
            font-size: 14px;
            color: #555;
            margin-bottom: 20px;
        }
        .donation-card button {
            background-color: #1a5c38;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        .donation-card button:hover {
            background-color: #145f30;
        }
        @media (max-width: 768px) {
            .donation-card {
                width: 100%;
            }
        }
    </style>
</head>
<body>
    <div class="head">
        TOGETHER Let's make a change
    </div>

    <div class="container">
        <!-- Regular Donation Card -->
        <div class="donation-card">
            <img src="https://pimsj.com/wp-content/uploads/2019/06/CISP080519-570x370.jpg" alt="Regular Donation">
            <h3>Regular Donation</h3>
            <p>Many people want to donate regularly but often forget to do so. From now on, Bkash and Nagad users can make regular donations from the As-Sunnah Foundation website by activating the automated system. On our...</p>
            <form action="donation_form.php" method="GET">
                <input type="hidden" name="category" value="Regular Donation">
                <button type="submit">Donate</button>
            </form>
        </div>

        <!-- Qurbani Fund Card -->
        <div class="donation-card">
            <img src="https://new-img.patrika.com/upload/2018/06/14/muslim-donation_2954241_835x547-m.jpg" alt="Qurbani Fund">
            <h3>Qurbani Fund</h3>
            <p>Many needy people want to taste beef/mutton only on the Eid of Qurbani every year. That is why every year the As-Sunnah Foundation organizes the distribution of meat of Qurbani under the title 'Qurbani fi...'.</p>
            <form action="donation_form.php" method="GET">
                <input type="hidden" name="category" value="Qurbani Fund">
                <button type="submit">Donate</button>
            </form>
        </div>

        <!-- As-Sunnah Skill Development Institute Card -->
        <div class="donation-card">
            <img src="https://www.vishwajagritimission.org/wp-content/uploads/2023/05/skill-training.jpg" alt="Skill Development">
            <h3>As-Sunnah Skill Development Institute</h3>
            <p>As-Sunnah Skill Development Institute is a subsidiary of As-Sunnah Foundation, established in 2022. It is a self development and skill development organization registered by National Skill Development...</p>
            <form action="donation_form.php" method="GET">
                <input type="hidden" name="category" value="As-Sunnah Skill Development Institute">
                <button type="submit">Donate</button>
            </form>
        </div>
    </div>

    <?php
    // Display error if any
    if (isset($error)) {
        echo "<p style='color:red;text-align:center;'>$error</p>";
    }
    ?>

    <?php include '../includes/footer.php'; ?>
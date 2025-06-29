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


<link rel="stylesheet" href="../assets/css/donate_form.css">
<?php include '../includes/footer.php'; ?>

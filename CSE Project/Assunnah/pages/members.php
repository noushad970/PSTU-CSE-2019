<?php include '../includes/header.php'; ?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Donor and Lifetime Member - As-Sunnah Foundation</title>
    <style>
       
    </style>
</head>
<body>
    <div class="head">
        DONOR AND LIFETIME MEMBER
    </div>
    <?php
    if (isset($_POST['submit'])) {
        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "assunnah";

        $conn = new mysqli($servername, $username, $password, $dbname);

        // Create table if it doesn't exist
        $sql = "CREATE TABLE IF NOT EXISTS membership_applications (
            member_type VARCHAR(50),
            name VARCHAR(100),
            fathers_name VARCHAR(100),
            probashi BOOLEAN,
            phone_number VARCHAR(15),
            email VARCHAR(100) PRIMARY KEY,
            occupation VARCHAR(50),
            reference VARCHAR(100),
            address VARCHAR(200),
            donation_payment_method VARCHAR(50),
            membership_status VARCHAR(20) DEFAULT 'pending'
        )";

        if ($conn->query($sql) === TRUE) {
            // Prepare and bind
            $stmt = $conn->prepare("INSERT INTO membership_applications (member_type, name, fathers_name, probashi, phone_number, email, occupation, reference, address, donation_payment_method, membership_status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 'pending')");
            $stmt->bind_param("sssississs", $member_type, $name, $fathers_name, $probashi, $phone_number, $email, $occupation, $reference, $address, $donation_payment_method);

            // Set parameters
            $member_type = $_POST['member_type'];
            $name = $_POST['name'];
            $fathers_name = $_POST['fathers_name'];
            $probashi = isset($_POST['probashi']) ? 1 : 0;
            $phone_number = $_POST['phone_number'];
            $email = $_POST['email'];
            $occupation = $_POST['occupation'];
            $reference = $_POST['reference'];
            $address = $_POST['address'];
            $donation_payment_method = $_POST['donation_payment_method'];

            // Execute
            if ($stmt->execute()) {
                echo "<p style='color:green;text-align:center;'>Application submitted successfully!</p>";
            } else {
                echo "<p style='color:red;text-align:center;'>Error: " . $conn->error . "</p>";
            }

            $stmt->close();
        } else {
            echo "<p style='color:red;text-align:center;'>Error creating table: " . $conn->error . "</p>";
        }

        $conn->close();
    }
    ?>
<!-- Application Form Section -->
<div class="form-section">
        <h2>Application Form</h2>
        <form id="membershipForm" method="POST" action="">
            <label class="required">Member Type:</label>
            <select name="member_type" required>
                <option value="">Please select Member Type</option>
                <option value="Lifetime Member">Lifetime Member</option>
                <option value="Donor Member">Donor Member</option>
                <option value="Square Feet Donor">Square Feet Donor</option>
            </select>

            <label class="required">Name:</label>
            <input type="text" name="name" value="" required>

            <label class="required">Fathers Name:</label>
            <input type="text" name="fathers_name" value="" required>

            <label>Probashi:</label>
            <input type="checkbox" name="probashi">

            <label class="required">Phone Number:</label>
            <input type="text" name="phone_number" value="" required>

            <label class="required">Email:</label>
            <input type="email" name="email" value="" required>

            <label>Occupation:</label>
            <select name="occupation">
                <option value="">Select Occupation</option>
                <option value="Student">Student</option>
                <option value="Professional">Professional</option>
                <option value="Business">Business</option>
            </select>

            <label>Reference:</label>
            <input type="text" name="reference" value="">

            <label class="required">Address:</label>
            <input type="text" name="address" value="" required>

            <label class="required">Donation Payment Method:</label>
            <select name="donation_payment_method" id="donationPaymentMethod" required>
                <option value="">Please select a donation payment method</option>
                <option value="Bank Transfer">Bank Transfer</option>
                <option value="Mobile Banking">Mobile Banking</option>
                <option value="Cash">Cash</option>
            </select>
            <div class="payment-options" id="paymentOptions">
                <div class="payment-images">
                    <img id="bankImage" src="https://penguwin.com/wp-content/uploads/2014/11/PenguWINs-Bank-Account-Details-Nov-2014.jpg" alt="Bank Transfer">
                    <img id="mobileImage" src="https://i.ytimg.com/vi/IOKMPFjh9HU/maxresdefault.jpg" alt="Mobile Banking">
                    <img id="cashImage" src="https://admission.mvn.edu.in/wp-content/uploads/2021/08/bank-account-details.jpg" alt="Cash">
                </div>
            </div>

            <button type="submit" name="submit">Submit</button>
        </form>
    </div>
    <div class="container">
        <!-- Video Section -->
        <div class="video-section">
            <!-- Placeholder image for the video thumbnail -->
            <img src="https://i.ytimg.com/vi/FRAoIxlQBkU/maxresdefault.jpg" alt="Video Thumbnail">
            <a href="https://www.youtube.com/watch?v=FRAoIxlQBkU" target="_blank" class="watch-btn">WATCH ON YouTube</a>
            <div class="text-section">
            <h3 style="alignment:center">
            As-Sunnah Foundation Mosque Complex
            </h3>
            <p>
            The mosque of the Prophet (peace and blessings of Allaah be upon him) 
            was a center of many welfare besides offering prayers. Although Dhaka 
            is a city of mosques, most of the mosques are limited to congregational 
            prayers and Moktob (Morning kindergarten for the children to teach the Quran).
             As-Sunnah Foundation wants to build an ideal mosque in Dhaka, which will be
              dedicated to various charitable activities besides performing Salat. It includes
               regular religious education for people of different classes and professions, 
               distribution of weekly summaries of khutba among the worshipers, opportunities
                to meet and get acquainted with the knowledgeable scholars, special corner 
                for women and children, free primary health care for distressed patients and
                 providing assistance in resolving family and personal disputes through 
                 counseling system. In-Sha-Allah there will be various activities including 
                 Musafirkhana (Inn) for the people who come to Dhaka for various temporary 
                 needs from the village.
            In-sha-Allah there will also be the head office of the As-Sunnah Foundation for all the cha
            ritable activities carried out across the country next to the mosque. From where the Foundation's 
            countrywide mosques, madrasas and various services and humanitarian activities will be conducted.
            </p>
            </div>
        </div>

        <!-- Text Section -->
        <div class="text-section">
            <h2>MEMBER CALL</h2>
            <p>
                'LIFETIME MEMBER', 'DONOR MEMBER' and 'SQUARE FEET DONOR' are being collected as per Article 4 B and C of the constitution of As-Sunnah Foundation. Donor members, lifetime members and Square feet donors will be able to make any suggestions for the benefit of the Foundation. The one-time grant collected from the members of these two councils will be used for the construction of ‘As-Sunnah Foundation Complex’.
            </p>
            <p>
                Note that this is a Sadaqah Jariyah project, the reward of which will continue to be included in the donor even after death In sha Allah.
            </p>
            <p>
                আস-সুন্নাহ ফাউন্ডেশনের গঠনতন্ত্রের ৪ নং ধারার খ ও গ পড়ে আজীবন সদস্য ও ডাটা সদস্য সংগ্রহ করা হচ্ছে। আল্লাহর ইচ্ছায় পরবর্তীতে পুর</p>

            <h3>LIFETIME MEMBER</h3>
            <p>
                All members who donate at least 100,000/= (One Lakh) or more to the foundation fund for the foundation, will be lifetime members of the foundation.
            </p>

            <h3>DONOR MEMBER</h3>
            <p>
                All members who donate at least 50,000/= (fifty thousand) or more to the foundation fund for the foundation, will be the donor members of the foundation.
            </p>

            <h3>AS-SUNNAH FOUNDATION MOSQUE COMPLEX</h3>
            <p>
                The mosque of the Prophet (peace and blessings of Allah be upon him) was a center of many welfare besides offering prayers. Although Dhaka is a city of mosques, most of the mosques are limited to congregational prayers and Moktob (Morning kindergarten for the children to teach the Quran). As-Sunnah Foundation wants to build an ideal mosque in Dhaka which will be dedicated to various charitable causes.
            </p>
            <p style="color:black">
                Membership rules:
            </p>
            <p> 1. All members of the foundation must follow the Qur'an and Sunnah and be free from shirk (Polytheism) and bid'at (Innovation).</p>
            <p> 2. Payment for membership fee must be halal.</p>
            <p> 3.Fill out the prescribed form.</p>

        </div>
    </div>
    
   

    <script>
        const paymentMethod = document.getElementById('donationPaymentMethod');
        const paymentOptions = document.getElementById('paymentOptions');
        const images = {
            'Bank Transfer': document.getElementById('bankImage'),
            'Mobile Banking': document.getElementById('mobileImage'),
            'Cash': document.getElementById('cashImage')
        };

        paymentMethod.addEventListener('change', function() {
            paymentOptions.style.display = this.value ? 'block' : 'none';
            Object.values(images).forEach(img => img.style.display = 'none');
            if (this.value) {
                images[this.value].style.display = 'inline';
            }
        });
    </script>
</body>
</html>

<link rel="stylesheet" href="../assets/css/members.css">
<?php include '../includes/footer.php'; ?>
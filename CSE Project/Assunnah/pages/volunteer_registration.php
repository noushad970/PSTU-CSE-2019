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

// Handle form submission
$message = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nid_number = $_POST['nid_number'];
    $name = $_POST['name'];
    $probashi = isset($_POST['probashi']) ? 1 : 0;
    $phone_number = $_POST['phone_number'];
    $emergency_phone = $_POST['emergency_phone'];
    $email = $_POST['email'];
    $facebook_link = $_POST['facebook_link'];
    $educational_info = $_POST['educational_info'];
    $occupation = $_POST['occupation'];
    $permanent_district_thana = $_POST['permanent_district_thana'];
    $permanent_address = $_POST['permanent_address'];
    $present_district_thana = $_POST['present_district_thana'];
    $present_address = $_POST['present_address'];
    $volunteer_for = $_POST['volunteer_for'];
    $special_skill = $_POST['special_skill'];

    // Basic validation
    if (empty($nid_number) || empty($name) || empty($phone_number) || empty($emergency_phone) || empty($email) || empty($volunteer_for) || empty($permanent_district_thana) || empty($permanent_address) || empty($present_district_thana) || empty($present_address)) {
        $message = "Please fill all mandatory fields.";
    } else {
        // Check for duplicate nid_number
        $check_nid = $conn->prepare("SELECT nid_number FROM volunteer_applications WHERE nid_number = ?");
        $check_nid->bind_param("s", $nid_number);
        $check_nid->execute();
        $result_nid = $check_nid->get_result();
        if ($result_nid->num_rows > 0) {
            $message = "An application with this NID number already exists.";
        } else {
            // Check for duplicate email
            $check_email = $conn->prepare("SELECT email FROM volunteer_applications WHERE email = ?");
            $check_email->bind_param("s", $email);
            $check_email->execute();
            $result_email = $check_email->get_result();
            if ($result_email->num_rows > 0) {
                $message = "An application with this email already exists.";
            } else {
                // Insert the new application
                $sql = "INSERT INTO volunteer_applications (nid_number, name, probashi, phone_number, emergency_phone, email, facebook_link, educational_info, occupation, permanent_district_thana, permanent_address, present_district_thana, present_address, volunteer_for, special_skill) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                $stmt = $conn->prepare($sql);
                $stmt->bind_param("ssissssssssssss", $nid_number, $name, $probashi, $phone_number, $emergency_phone, $email, $facebook_link, $educational_info, $occupation, $permanent_district_thana, $permanent_address, $present_district_thana, $present_address, $volunteer_for, $special_skill);

                if ($stmt->execute()) {
                    $message = "Application submitted successfully! Status: Pending.";
                } else {
                    $message = "Error submitting application.";
                }
                $stmt->close();
            }
            $check_email->close();
        }
        $check_nid->close();
    }
}
$conn->close();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Volunteer Registration - As-Sunnah Foundation</title>
    
</head>
<body>
    <div class="head">
        <h1>VOLUNTEER REGISTRATION</h1>
</div>

    <div class="container">
        <?php if ($message) { echo "<p class='message'>$message</p>"; } ?>
        <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
            <h3>Personal Information</h3>
            <div class="form-group">
                <label><span class="required">*</span> NID Number:</label>
                <div class="example">Example: 19893663636366</div>
                <input type="text" name="nid_number" required>
            </div>
            <div class="form-group">
                <label><span class="required">*</span> Name:</label>
                <div class="example">Example: Shahadat Hossain</div>
                <input type="text" name="name" required>
            </div>
            <div class="form-group">
                <label>Probashi:</label>
                <input type="checkbox" name="probashi" id="probashi">
            </div>
            <div class="form-group">
                <label><span class="required">*</span> Phone Number:</label>
                <div class="example">Example: 01XXXXXXXXX</div>
                <input type="tel" name="phone_number" pattern="[0-1]{2}[0-9]{9}" required>
            </div>
            <div class="form-group">
                <label><span class="required">*</span> Emergency Phone Number:</label>
                <div class="example">Example: 01XXXXXXXXX</div>
                <input type="tel" name="emergency_phone" pattern="[0-1]{2}[0-9]{9}" required>
            </div>
            <div class="form-group">
                <label><span class="required">*</span> Email:</label>
                <div class="example">Example: shahadat@email.com</div>
                <input type="email" name="email" required>
            </div>
            <div class="form-group">
                <label>Facebook ID Link:</label>
                <div class="example">Example: https://www.facebook.com/facebook...</div>
                <input type="url" name="facebook_link">
            </div>
            <div class="form-group">
                <label><span class="required">*</span> Educational Information:</label>
                <div class="example">Example: JSC, SSC, BA, Others</div>
                <input type="text" name="educational_info" required>
            </div>
            <div class="form-group">
                <label><span class="required">*</span> Occupation:</label>
                <select name="occupation" required>
                    <option value="" disabled selected>Select Occupation</option>
                    <option value="Teacher">Teacher</option>
                    <option value="Doctor">Doctor</option>
                    <option value="Engineer">Engineer</option>
                    <option value="Student">Student</option>
                    <option value="Worker">Worker</option>
                    <option value="Farmer">Farmer</option>
                    <option value="Other">Other</option>
                </select>
            </div>

            <h3>Permanent Address</h3>
            <div class="form-group">
                <label><span class="required">*</span> Division:</label>
                <select name="permanent_district_thana" required>
                    <option value="" disabled selected>Select Division</option>
                    <option value="Dhaka">Dhaka</option>
                    <option value="Chittagong">Chittagong</option>
                    <option value="Sylhet">Sylhet</option>
                    <option value="Khulna">Khulna</option>
                    <option value="Barisal">Barisal</option>
                    <option value="Rangpur">Rangpur</option>
                    <option value="Rajshahi">Rajshahi</option>
                    <option value="Mymensingh">Mymensingh</option>

                </select>
            </div>
            <div class="form-group">
                <label><span class="required">*</span> Address:</label>
                <div class="example">Example: Sharankhola, Shukhipur</div>
                <input type="text" name="permanent_address" required>
            </div>

            <h3>Present Address</h3>
            <div class="form-group">
                <label><span class="required">*</span> Division:</label>
                <select name="present_district_thana" required>
                <option value="" disabled selected>Select Division</option>
                    <option value="Dhaka">Dhaka</option>
                    <option value="Chittagong">Chittagong</option>
                    <option value="Sylhet">Sylhet</option>
                    <option value="Khulna">Khulna</option>
                    <option value="Barisal">Barisal</option>
                    <option value="Rangpur">Rangpur</option>
                    <option value="Rajshahi">Rajshahi</option>
                    <option value="Mymensingh">Mymensingh</option>  
                </select>
            </div>
            <div class="form-group">
                <label><span class="required">*</span> Address:</label>
                <div class="example">Example: House No - 3, Road - 4, Jhigatola</div>
                <input type="text" name="present_address" required>
            </div>

            <div class="form-group">
                <label><span class="required">*</span> Volunteer For:</label>
                <div class="example">Example: Teaching, Cooking, Rescuing</div>
                <input type="text" name="volunteer_for" required>
            </div>
            <div class="form-group">
                <label>Special Skill:</label>
                <div class="example">Example: Accountant, Medical Treatment</div>
                <input type="text" name="special_skill">
            </div>

            <p class="message" style="color: red;">* Marked fields are mandatory, others are optional</p>
            <button type="submit" class="submit-btn">Send My Application</button>
        </form>
    </div>
</body>
</html>

<link rel="stylesheet" href="../assets/css/volunteer.css">
<?php include '../includes/footer.php'; ?>
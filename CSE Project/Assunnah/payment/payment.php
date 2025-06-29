<?php
// payment.php
$amount = isset($_GET['amount']) ? floatval($_GET['amount']) : 0.00;

// Validate amount
if ($amount <= 0) {
    die("Invalid or missing amount! Debug: Received " . (isset($_GET['amount']) ? $_GET['amount'] : 'null'));
}

// SSLCommerz configuration
$post_data = array();
$post_data['store_id'] = "nsdte683711c3ca2f1";
$post_data['store_passwd'] = "nsdte683711c3ca2f1@ssl";
$post_data['total_amount'] = $amount;
$post_data['currency'] = "BDT";
$post_data['tran_id'] = isset($_GET['tran_id']) ? $_GET['tran_id'] : "SSLCZ_TEST_" . uniqid();
$post_data['success_url'] = "http://localhost/As_Sunnah_Foundation/payment/success.php";
$post_data['fail_url'] = "http://localhost/As_Sunnah_Foundation/payment/fail.php";
$post_data['cancel_url'] = "http://localhost/As_Sunnah_Foundation/payment/cancel.php";

// EMI INFO
$post_data['emi_option'] = "1";
$post_data['emi_max_inst_option'] = "9";
$post_data['emi_selected_inst'] = "9";

// CUSTOMER INFORMATION
$post_data['cus_name'] = "Test Customer";
$post_data['cus_email'] = "test@test.com";
$post_data['cus_add1'] = "Dhaka";
$post_data['cus_add2'] = "Dhaka";
$post_data['cus_city'] = "Dhaka";
$post_data['cus_state'] = "Dhaka";
$post_data['cus_postcode'] = "1000";
$post_data['cus_country'] = "Bangladesh";
$post_data['cus_phone'] = "01711111111";
$post_data['cus_fax'] = "01711111111";

// SHIPMENT INFORMATION
$post_data['ship_name'] = "testnsdtet64s";
$post_data['ship_add1'] = "Dhaka";
$post_data['ship_add2'] = "Dhaka";
$post_data['ship_city'] = "Dhaka";
$post_data['ship_state'] = "Dhaka";
$post_data['ship_postcode'] = "1000";
$post_data['ship_country'] = "Bangladesh";

// OPTIONAL PARAMETERS
$post_data['value_a'] = "ref001";
$post_data['value_b'] = "ref002";
$post_data['value_c'] = "ref003";
$post_data['value_d'] = "ref004";

// CART PARAMETERS
$post_data['cart'] = json_encode(array(
    array("product" => "DHK TO BRS AC A1", "amount" => "200.00"),
    array("product" => "DHK TO BRS AC A2", "amount" => "200.00"),
    array("product" => "DHK TO BRS AC A3", "amount" => "200.00"),
    array("product" => "DHK TO BRS AC A4", "amount" => "200.00")
));
$post_data['product_amount'] = "100";
$post_data['vat'] = "5";
$post_data['discount_amount'] = "5";
$post_data['convenience_fee'] = "3";

// Send to SSLCommerz
$direct_api_url = "https://sandbox.sslcommerz.com/gwprocess/v3/api.php";

$handle = curl_init();
curl_setopt($handle, CURLOPT_URL, $direct_api_url);
curl_setopt($handle, CURLOPT_TIMEOUT, 30);
curl_setopt($handle, CURLOPT_CONNECTTIMEOUT, 30);
curl_setopt($handle, CURLOPT_POST, 1);
curl_setopt($handle, CURLOPT_POSTFIELDS, $post_data);
curl_setopt($handle, CURLOPT_RETURNTRANSFER, true);
curl_setopt($handle, CURLOPT_SSL_VERIFYPEER, false); // Set to true for production

$content = curl_exec($handle);
$code = curl_getinfo($handle, CURLINFO_HTTP_CODE);

if ($code == 200 && !(curl_errno($handle))) {
    curl_close($handle);
    $sslcommerzResponse = $content;
} else {
    curl_close($handle);
    echo "FAILED TO CONNECT WITH SSLCOMMERZ API";
    exit;
}

# PARSE THE JSON RESPONSE
$sslcz = json_decode($sslcommerzResponse, true);

if (isset($sslcz['GatewayPageURL']) && $sslcz['GatewayPageURL'] != "") {
    echo "<meta http-equiv='refresh' content='0;url=" . $sslcz['GatewayPageURL'] . "'>";
    exit;
} else {
    echo "JSON Data parsing error!";
}
?>
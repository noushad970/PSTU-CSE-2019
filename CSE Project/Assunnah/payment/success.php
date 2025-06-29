<?php
$val_id = urlencode($_POST['val_id']);
$store_id = urlencode("nsdte683711c3ca2f1");
$store_passwd = urlencode("nsdte683711c3ca2f1@ssl");
$requested_url = "https://sandbox.sslcommerz.com/validator/api/validationserverAPI.php?val_id=" . $val_id . "&store_id=" . $store_id . "&store_passwd=" . $store_passwd . "&v=1&format=json";

$handle = curl_init();
curl_setopt($handle, CURLOPT_URL, $requested_url);
curl_setopt($handle, CURLOPT_RETURNTRANSFER, true);
curl_setopt($handle, CURLOPT_SSL_VERIFYHOST, false); # IF YOU RUN FROM LOCAL PC
curl_setopt($handle, CURLOPT_SSL_VERIFYPEER, false); # IF YOU RUN FROM LOCAL PC

$result = curl_exec($handle);

$code = curl_getinfo($handle, CURLINFO_HTTP_CODE);

if ($code == 200 && !(curl_errno($handle))) {
    # TO CONVERT AS OBJECT
    $result = json_decode($result);

    # TRANSACTION INFO
    $status = $result->status;
    $tran_date = $result->tran_date;
    $tran_id = $result->tran_id;
    $val_id = $result->val_id;
    $amount = $result->amount;
    $store_amount = $result->store_amount;
    $bank_tran_id = $result->bank_tran_id;
    $card_type = $result->card_type;

    # EMI INFO
    $emi_instalment = $result->emi_instalment;
    $emi_amount = $result->emi_amount;
    $emi_description = $result->emi_description;
    $emi_issuer = $result->emi_issuer;

    # ISSUER INFO
    $card_no = $result->card_no;
    $card_issuer = $result->card_issuer;
    $card_brand = $result->card_brand;
    $card_issuer_country = $result->card_issuer_country;
    $card_issuer_country_code = $result->card_issuer_country_code;

    # API AUTHENTICATION
    $APIConnect = $result->APIConnect;
    $validated_on = $result->validated_on;
    $gw_version = $result->gw_version;

    # Database update for successful payment
    if ($status === 'VALID') {
        require_once __DIR__ . '/../includes/db_connect.php';
        $stmt = $conn->prepare("UPDATE donations SET payment_status = 'Completed', validated_on = ?, bank_tran_id = ?, card_type = ? WHERE tran_id = ? AND payment_status = 'Pending'");
        $stmt->bind_param("ssss", $validated_on, $bank_tran_id, $card_type, $tran_id);
        if ($stmt->execute()) {
            echo "Payment successful! Amount: " . htmlspecialchars($amount) . " BDT, Transaction ID: " . htmlspecialchars($tran_id);
        } else {
            echo "Error updating payment status: " . htmlspecialchars($conn->error);
        }
        $stmt->close();
        $conn->close();
    } else {
        echo "Payment validation failed. Status: " . htmlspecialchars($status);
    }
} else {
    echo "Failed to connect with SSLCOMMERZ";
}

curl_close($handle);
?>
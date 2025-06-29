<?php
session_start();

if (!isset($_SESSION['admin_logged_in']) || $_SESSION['admin_logged_in'] !== true) {
    header("Location: adminsignin.php");
    exit();
}

require_once __DIR__ . '/../includes/db_connect.php';

$perPage = 25;
$page = isset($_GET['page']) ? max(1, intval($_GET['page'])) : 1;
$offset = ($page - 1) * $perPage;

$filterStatus = isset($_GET['status']) ? $_GET['status'] : 'all';
$filterCategory = isset($_GET['category']) ? $_GET['category'] : 'all';

// Fetch unique categories for the category filter
$categoriesStmt = $conn->prepare("SELECT DISTINCT category FROM donations");
$categoriesStmt->execute();
$categoriesResult = $categoriesStmt->get_result();
$categories = $categoriesResult->fetch_all(MYSQLI_ASSOC);
$categoriesStmt->close();

// Calculate total completed donations
$totalCompletedStmt = $conn->prepare("SELECT SUM(amount) as total_completed FROM donations WHERE payment_status = 'Completed'");
$totalCompletedStmt->execute();
$totalCompletedResult = $totalCompletedStmt->get_result();
$totalCompleted = $totalCompletedResult->fetch_assoc()['total_completed'] ?? 0;
$totalCompletedStmt->close();

// Prepare the main query with filters
$sql = "SELECT * FROM donations";
$paramTypes = "";
$params = [];
if ($filterStatus !== 'all') {
    $sql .= " WHERE payment_status = ?";
    $paramTypes .= "s";
    $params[] = &$filterStatus;
}
if ($filterCategory !== 'all') {
    $sql .= ($filterStatus !== 'all' ? " AND" : " WHERE") . " category = ?";
    $paramTypes .= "s";
    $params[] = &$filterCategory;
}

$stmt = $conn->prepare($sql);
if (!empty($paramTypes)) {
    $stmt->bind_param($paramTypes, ...$params);
}
$stmt->execute();
$result = $stmt->get_result();
$totalRows = $result->num_rows;
$totalPages = ceil($totalRows / $perPage);

// Apply pagination
$sql .= " LIMIT ? OFFSET ?";
$paramTypes .= "ii";
$params = array_merge($params, [&$perPage, &$offset]);
$stmt = $conn->prepare($sql);
$stmt->bind_param($paramTypes, ...$params);
$stmt->execute();
$result = $stmt->get_result();

$conn->close();
?>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Donation Collection</title>
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

  header .total-completed {
    font-size: 16px;
    font-weight: 600;
  }

  button.back {
    background: #6b46c1;
    border: none;
    color: white;
    padding: 10px 20px;
    border-radius: 8px;
    font-weight: 600;
    cursor: pointer;
    transition: background 0.3s ease;
  }

  button.back:hover {
    background: #553c9a;
  }

  main {
    flex: 1;
    width: 90%;
    max-width: 1200px;
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

  .filter-section {
    margin-bottom: 20px;
    text-align: center;
    display: flex;
    justify-content: center;
    gap: 20px;
  }

  .filter-section select {
    padding: 10px;
    font-size: 16px;
    border-radius: 8px;
    border: 1px solid #ccc;
    background: white;
    color: #333;
  }

  table {
    width: 100%;
    border-collapse: collapse;
    margin-bottom: 20px;
  }

  th, td {
    padding: 12px;
    text-align: left;
    border-bottom: 1px solid rgba(255, 255, 255, 0.2);
  }

  th {
    background: #6b46c1;
    font-weight: 600;
  }

  tr:nth-child(even) {
    background: rgba(255, 255, 255, 0.05);
  }

  .pagination {
    text-align: center;
    margin-top: 20px;
  }

  .pagination a {
    color: white;
    padding: 8px 12px;
    text-decoration: none;
    background: #6b46c1;
    border-radius: 5px;
    margin: 0 5px;
    transition: background 0.3s ease;
  }

  .pagination a:hover {
    background: #553c9a;
  }

  .pagination .active {
    background: #553c9a;
    font-weight: 600;
  }

  /* Animations */
  @keyframes slideDown {
    0% { opacity: 0; transform: translateY(-50px); }
    100% { opacity: 1; transform: translateY(0); }
  }

  @keyframes fadeInUp {
    0% { opacity: 0; transform: translateY(30px); }
    100% { opacity: 1; transform: translateY(0); }
  }
</style>
</head>
<body>

<header>
  <h1>Donation Collection</h1>
  <div>
    <span class="total-completed">Total Completed: <?php echo number_format($totalCompleted, 2); ?> BDT</span>
    <form method="POST" action="adminPage.php">
      <button type="submit" class="back">Back</button>
    </form>
  </div>
</header>

<main>
  <h2>Donation Records</h2>
  <div class="filter-section">
    <form method="GET" action="">
      <label for="status">Filter by Status:</label>
      <select name="status" id="status" onchange="this.form.submit()">
        <option value="all" <?php echo $filterStatus === 'all' ? 'selected' : ''; ?>>All</option>
        <option value="Completed" <?php echo $filterStatus === 'Completed' ? 'selected' : ''; ?>>Completed</option>
        <option value="Pending" <?php echo $filterStatus === 'Pending' ? 'selected' : ''; ?>>Pending</option>
        <option value="Canceled" <?php echo $filterStatus === 'Canceled' ? 'selected' : ''; ?>>Canceled</option>
      </select>
      <label for="category">Filter by Category:</label>
      <select name="category" id="category" onchange="this.form.submit()">
        <option value="all" <?php echo $filterCategory === 'all' ? 'selected' : ''; ?>>All</option>
        <?php foreach ($categories as $cat) : ?>
          <option value="<?php echo htmlspecialchars($cat['category']); ?>" <?php echo $filterCategory === $cat['category'] ? 'selected' : ''; ?>>
            <?php echo htmlspecialchars($cat['category']); ?>
          </option>
        <?php endforeach; ?>
      </select>
      <input type="hidden" name="page" value="1"> <!-- Reset to page 1 on filter change -->
    </form>
  </div>
  <table>
    <thead>
      <tr>
        <th>ID</th>
        <th>Category</th>
        <th>Donator Number</th>
        <th>Amount</th>
        <th>Payment Status</th>
        <th>Transaction ID</th>
        <th>Validated On</th>
        <th>Bank Transaction ID</th>
      </tr>
    </thead>
    <tbody>
      <?php while ($row = $result->fetch_assoc()) : ?>
        <tr>
          <td><?php echo htmlspecialchars($row['id']); ?></td>
          <td><?php echo htmlspecialchars($row['category']); ?></td>
          <td><?php echo htmlspecialchars($row['donator_number']); ?></td>
          <td><?php echo htmlspecialchars(number_format($row['amount'], 2)); ?> BDT</td>
          <td><?php echo htmlspecialchars($row['payment_status']); ?></td>
          <td><?php echo htmlspecialchars($row['tran_id']); ?></td>
          <td><?php echo htmlspecialchars($row['validated_on'] ?? 'N/A'); ?></td>
          <td><?php echo htmlspecialchars($row['bank_tran_id'] ?? 'N/A'); ?></td>
        </tr>
      <?php endwhile; ?>
    </tbody>
  </table>
  <div class="pagination">
    <?php for ($i = 1; $i <= $totalPages; $i++) : ?>
      <a href="?page=<?php echo $i; ?>&status=<?php echo urlencode($filterStatus); ?>&category=<?php echo urlencode($filterCategory); ?>" class="<?php echo $page === $i ? 'active' : ''; ?>">
        <?php echo $i; ?>
      </a>
    <?php endfor; ?>
  </div>
</main>

</body>
</html>
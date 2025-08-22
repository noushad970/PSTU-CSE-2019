# 📌 Trapezoidal Rule in Machine Learning Context

import numpy as np
import matplotlib.pyplot as plt
from sklearn.metrics import roc_curve

# -------------------------------
# Part 1: Pure Math Example
# Integrate f(x) = x^2 from 0 to 2
# -------------------------------

def f(x):
    return x**2

# Interval
a, b = 0, 2
n = 10  # number of subintervals
x = np.linspace(a, b, n+1)
y = f(x)

# Apply trapezoidal rule
trapz_result = np.trapz(y, x)  # numpy has built-in trapezoidal rule

# Exact integral of x^2 dx = (x^3)/3 from 0 to 2 = 8/3 ≈ 2.6667
exact = (b**3 - a**3)/3

print("Trapezoidal Approximation:", trapz_result)
print("Exact Value:", exact)
print("Error:", abs(exact - trapz_result))

# Visualization
plt.figure(figsize=(6,4))
plt.plot(x, y, 'b-', label='f(x)=x^2')
plt.fill_between(x, 0, y, alpha=0.2, color='orange', label="Trapezoidal Approximation")
plt.title("Trapezoidal Rule Example (Math)")
plt.legend()
plt.show()


# -------------------------------
# Part 2: ML Example
# Using Trapezoidal Rule for AUC (ROC Curve)
# -------------------------------

# Simulated binary classification
np.random.seed(42)
y_true = np.random.randint(0, 2, 100)        # true labels
y_scores = np.random.rand(100)               # predicted probabilities

# Compute ROC curve
fpr, tpr, thresholds = roc_curve(y_true, y_scores)

# Approximate AUC using trapezoidal rule
auc_trapz = np.trapz(tpr, fpr)

print("\nApproximate AUC (Trapezoidal Rule):", auc_trapz)

# Visualization of ROC curve
plt.figure(figsize=(6,6))
plt.plot(fpr, tpr, label="ROC Curve")
plt.fill_between(fpr, 0, tpr, alpha=0.2, color='green', label=f"AUC ≈ {auc_trapz:.3f}")
plt.plot([0,1], [0,1], 'k--', label="Random Guess")
plt.xlabel("False Positive Rate")
plt.ylabel("True Positive Rate")
plt.title("ROC Curve with AUC (Trapezoidal Rule)")
plt.legend()
plt.show()

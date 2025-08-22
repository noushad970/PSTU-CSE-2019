# 📌 Polynomial Regression in Machine Learning

# Step 1: Import libraries
import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
from sklearn.preprocessing import PolynomialFeatures

# Step 2: Generate synthetic dataset
np.random.seed(42)
X = np.linspace(0, 10, 50).reshape(-1, 1)   # Feature
y = 2 + 1.5*X + 0.5*X**2 + np.random.randn(50, 1) * 5  # Quadratic with noise

# Step 3: Fit Linear Regression (baseline)
linear_model = LinearRegression()
linear_model.fit(X, y)
y_pred_linear = linear_model.predict(X)

# Step 4: Polynomial Regression (degree 2 and degree 4 for comparison)
poly2 = PolynomialFeatures(degree=2)
X_poly2 = poly2.fit_transform(X)

poly_model2 = LinearRegression()
poly_model2.fit(X_poly2, y)
y_pred_poly2 = poly_model2.predict(X_poly2)

# Try higher degree (degree 4)
poly4 = PolynomialFeatures(degree=4)
X_poly4 = poly4.fit_transform(X)

poly_model4 = LinearRegression()
poly_model4.fit(X_poly4, y)
y_pred_poly4 = poly_model4.predict(X_poly4)

# Step 5: Plot results
plt.figure(figsize=(10,6))
plt.scatter(X, y, color="black", label="Data (true)")

plt.plot(X, y_pred_linear, color="blue", label="Linear Regression")
plt.plot(X, y_pred_poly2, color="red", label="Polynomial Regression (Degree 2)")
plt.plot(X, y_pred_poly4, color="green", linestyle="--", label="Polynomial Regression (Degree 4)")

plt.title("Polynomial Regression Example")
plt.xlabel("X")
plt.ylabel("y")
plt.legend()
plt.show()

# Step 6: Print model scores
print("Linear Regression R² Score:", linear_model.score(X, y))
print("Polynomial Regression (Degree 2) R² Score:", poly_model2.score(X_poly2, y))
print("Polynomial Regression (Degree 4) R² Score:", poly_model4.score(X_poly4, y))

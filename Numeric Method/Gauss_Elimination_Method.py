import numpy as np

def gauss_elimination(aug_matrix):
    aug_matrix = aug_matrix.astype(float)  
    n = len(aug_matrix)

    for i in range(n):
        max_row = np.argmax(abs(aug_matrix[i:, i])) + i
        aug_matrix[[i, max_row]] = aug_matrix[[max_row, i]]
        
        pivot = aug_matrix[i][i]
        if pivot == 0:
            raise ValueError("Matrix is singular or has no unique solution.")
        
        aug_matrix[i] = aug_matrix[i] / pivot
        for j in range(i+1, n):
            aug_matrix[j] = aug_matrix[j] - aug_matrix[j][i] * aug_matrix[i]

    # Back Substitution
    x = np.zeros(n)
    for i in range(n-1, -1, -1):
        x[i] = aug_matrix[i, -1] - np.dot(aug_matrix[i, i+1:n], x[i+1:n])

    return x

# Example usage:
# System: 2x + 3y - z = 5
#         4x + y  + 2z = 6
#         -2x + 5y - 3z = -4

aug = np.array([
    [2, 3, -1, 5],
    [4, 1, 2, 6],
    [-2, 5, -3, -4]
], dtype=float)

solution = gauss_elimination(aug)
print("Solution:", solution)

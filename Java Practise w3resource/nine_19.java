import java.util.Scanner;

public class nine_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Enter details for the first matrix:");
        int[][] matrix1 = inputMatrix(scanner);

      
        System.out.println("Enter details for the second matrix:");
        int[][] matrix2 = inputMatrix(scanner);

        if (areMatricesCompatible(matrix1, matrix2)) {
           
            int[][] sumMatrix = sumMatrices(matrix1, matrix2);

          
            System.out.println("Resultant matrix after summation:");
            printMatrix(sumMatrix);
        } else {
            System.out.println("Matrices are not compatible for summation.");
        }

        scanner.close();
    }

    private static int[][] inputMatrix(Scanner scanner) {
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    private static boolean areMatricesCompatible(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    private static int[][] sumMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

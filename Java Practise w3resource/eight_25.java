import java.util.Scanner;

public class eight_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows for the rhombus: ");
        int numRows = input.nextInt();

        for (int i = 1; i <= numRows; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers for the current row (increasing order)
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Print numbers for the current row (decreasing order, excluding 1)
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }

        for (int i = numRows - 1; i >= 1; i--) {
            // Print spaces for alignment
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers for the current row (increasing order)
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Print numbers for the current row (decreasing order, excluding 1)
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }
    }
}

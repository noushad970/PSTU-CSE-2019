import java.util.Scanner;

public class eight_22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = s.nextInt();

        for (int i = 0; i < numRows; i++) {
            int number = 1;

            for (int j = 0; j < numRows - i; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.printf("%6d", number);
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}

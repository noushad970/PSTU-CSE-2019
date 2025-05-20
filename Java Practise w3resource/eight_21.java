import java.util.Scanner;

public class eight_21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of rows for the diamond: ");
        int numRows = s.nextInt();

        if (numRows % 2 == 0) {
            System.out.println("Please enter an odd number of rows for a proper diamond pattern.");
            return;
        }

        int spaces = numRows / 2;
        int stars = 1;

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (i < (numRows + 1) / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }
    }
}

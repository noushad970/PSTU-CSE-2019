import java.util.Scanner;

public class eight_26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the character for the rhombus: ");
        char character = s.next().charAt(0);
        s.nextLine();  

        System.out.print("Enter the number of rows for the rhombus: ");
        int numRows = s.nextInt();

        for (int i = 1; i <= numRows; i++) {
           
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(character);
            }

             for (int k = i - 1; k >= 1; k--) {
                System.out.print(character);
            }

            System.out.println();
        }

        for (int i = numRows - 1; i >= 1; i--) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(character);
            }

            for (int k = i - 1; k >= 1; k--) {
                System.out.print(character);
            }

            System.out.println();
        }
    }
}

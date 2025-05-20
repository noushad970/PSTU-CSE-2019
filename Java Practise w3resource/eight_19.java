import java.util.Scanner;

public class eight_19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pyramid: ");
        int numRows = s.nextInt();

        for (int i = 1; i <= numRows; i++) {
           
            for (int j = numRows - i; j > 0; j--) {
                System.out.print(" ");
            }

            
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }

            System.out.println(); 
        }
    }
}

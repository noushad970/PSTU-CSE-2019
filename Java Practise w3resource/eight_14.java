import java.util.Scanner;

public class eight_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Cubes of numbers up to " + n + " are:");

            for (int i = 1; i <= n; i++) {
                int cube = i * i * i;
                System.out.println("Cube of " + i + " is: " + cube);
            }
        }
    }
}

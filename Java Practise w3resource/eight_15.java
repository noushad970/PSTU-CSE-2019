import java.util.Scanner;

public class eight_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of 'n': ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer for 'n'.");
        } else {
            int sum = 0;

            System.out.println("The first " + n + " odd natural numbers are:");
            for (int i = 1, count = 0; count < n; i += 2, count++) {
                System.out.print(i + " ");
                sum += i;
            }

            System.out.println("\nSum of the first " + n + " odd natural numbers is: " + sum);
        }
    }
}

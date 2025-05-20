import java.util.Scanner;

public class eight_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the value of 'n': ");
        int n = s.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer for 'n'.");
        } else {
            int sum = 0;

            System.out.println("The first " + n + " natural numbers are:");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
                sum += i;
            }

            System.out.println("\nSum of the first " + n + " natural numbers is: " + sum);
        }
    }
}

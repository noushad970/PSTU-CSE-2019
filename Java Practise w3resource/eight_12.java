import java.util.Scanner;

public class eight_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        double sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = s.nextDouble();
            sum += number;
        }

        double average = sum / 5;

        System.out.println("Sum of the 5 numbers is: " + sum);
        System.out.println("Average of the 5 numbers is: " + average);
    }
}

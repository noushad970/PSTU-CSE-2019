import java.util.Scanner;

public class eight_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = input.nextDouble();

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal.");
        } else if (number1 != number2 && number2 != number3 && number1 != number3) {
            System.out.println("All numbers are different.");
        } else {
            System.out.println("Neither all are equal nor all are different.");
        }
    }
}

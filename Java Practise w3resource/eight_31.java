import java.util.Scanner;

public class eight_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = input.nextDouble();

        if (number1 < number2 && number2 < number3) {
            System.out.println("Increasing");
        } else if (number1 > number2 && number2 > number3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
    }
}

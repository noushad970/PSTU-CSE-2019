import java.util.Scanner;

public class eight_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first floating-point number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second floating-point number: ");
        double num2 = input.nextDouble();

        double threshold = 0.01;

        if (Math.abs(num1 - num2) <= threshold) {
            System.out.println("The numbers are the same up to two decimal places.");
        } else {
            System.out.println("The numbers are not the same up to two decimal places.");
        }
    }
}

import java.util.Scanner;

public class eight_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first floating-point number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second floating-point number: ");
        double num2 = input.nextDouble();

        if (areEqualUpToThreeDecimalPlaces(num1, num2)) {
            System.out.println("The numbers are equal up to three decimal places.");
        } else {
            System.out.println("The numbers are not equal up to three decimal places.");
        }
    }

    public static boolean areEqualUpToThreeDecimalPlaces(double num1, double num2) {
        // Multiply both numbers by 1000 and convert to integers to compare up to three decimal places.
        int scaledNum1 = (int) (num1 * 1000);
        int scaledNum2 = (int) (num2 * 1000);

        return scaledNum1 == scaledNum2;
    }
}

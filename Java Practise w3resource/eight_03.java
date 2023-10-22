import java.util.Scanner;

public class eight_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = s.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = s.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = s.nextDouble();

        double greatest = findGreatest(num1, num2, num3);

        System.out.println("The greatest number is: " + greatest);
    }

    public static double findGreatest(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}

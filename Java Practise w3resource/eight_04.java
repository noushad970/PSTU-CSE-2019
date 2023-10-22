import java.util.Scanner;

public class  eight_04{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = s.nextDouble();

        if (number == 0) {
            System.out.println("zero");
        } else if (number > 0) {
            System.out.print("positive");
            if (Math.abs(number) < 1) {
                System.out.println(" small");
            } else if (Math.abs(number) > 1_000_000) {
                System.out.println(" large");
            } else {
                System.out.println();
            }
        } else {
            System.out.print("negative");
            if (Math.abs(number) < 1) {
                System.out.println(" small");
            } else if (Math.abs(number) > 1_000_000) {
                System.out.println(" large");
            } else {
                System.out.println();
            }
        }
    }
}

import java.util.Scanner;

public class eight_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Quadratic Equation Solver");
        System.out.print("Enter the coefficient 'a': ");
        double a = s.nextDouble();

        System.out.print("Enter the coefficient 'b': ");
        double b = s.nextDouble();

        System.out.print("Enter the coefficient 'c': ");
        double c = s.nextDouble();

        // Calculate the discriminant (b^2 - 4ac)
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real and distinct roots: Root1 = " + root1 + ", Root2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One real root: Root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Two complex roots: Root1 = " + realPart + " + " + imaginaryPart + "i, Root2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}

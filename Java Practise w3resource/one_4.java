import java.util.Scanner;

public class one_4 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number of side's in the polygon: ");
        double n=s1.nextDouble();
        System.out.println("Enter the lenght of every side of the polygon: ");
        double s=s1.nextDouble();
        double Area=(n*s*s)/(4*Math.tan(3.1416/n));
        System.out.println("The area of the poly: "+Area);
    }
}

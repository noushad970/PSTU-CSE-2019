import java.util.Scanner;

public class one_5 {
    public static void main(String[] args) {
        double radius=6371.01d;
        double x1,x2,y1,y2;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the latitude of coordinate 1 (x1): ");
        x1=s1.nextDouble();
        System.out.println("Enter the longitude of coordinate 1 (x2): ");
        x2=s1.nextDouble();
        System.out.println("Enter the latitude of coordinate 2 (y1): ");
        y1=s1.nextDouble();
        System.out.println("Enter the longitude of coordinate 2 (y2): ");
        y2=s1.nextDouble();
       
        double  d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println("The distance between two point on the surface of earth is: "+d);
       
    }
}

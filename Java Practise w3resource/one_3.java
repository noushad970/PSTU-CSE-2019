import java.util.Scanner;

public class one_3 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter The lenght of side: ");
        double s=s1.nextDouble();
        double area= (6 * s*s)/(4*Math.tan(3.1416/6));
        System.out.println("The Area of HexaGon is : "+area);
    }
    
}

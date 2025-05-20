import java.util.Scanner;

public class seven_11 {
 public static void main(String[] args) {
    Double d;
    float f;
    Scanner s= new Scanner(System.in);
    System.out.println("Enter double value: ");
    d=s.nextDouble();
    System.out.println("Enter float value: ");
    f=s.nextFloat();
    boolean isdouble,isfloat;
    isdouble= Double.isFinite(d);
    isfloat=Double.isFinite(f);
    if(isdouble)
    {
        System.out.println("The value is a finite double-point value");
    }
    else 
    System.out.println("value isnot a finite double-point value");
    if(isfloat)
    {
        System.out.println("The value is a finite floating-point value");
    }
    else 
    System.out.println("value isnot a finite floating-point value");

 }   
}

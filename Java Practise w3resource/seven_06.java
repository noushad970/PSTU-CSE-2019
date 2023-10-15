import java.util.Scanner;

public class seven_06 {
 public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    float mp,hi,mkg,hm,BMI;
    System.out.println("Enter Weight in Pounds:");
    mp=s.nextFloat();
    System.out.println("Enter Height in inches:");
    hi=s.nextFloat();
    mkg=(float)(mp*0.4535);
    hm=(float)(hi*0.0254);
    BMI=mkg/(hm*hm);
    System.out.println("Your BMI is: "+BMI);
 }   
}

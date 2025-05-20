import java.util.Scanner;

public class seven_01 {
    public static void main(String[] args) {
        float f,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit: ");
        f=s.nextFloat();
        c=(5*(f-32))/9;
        System.out.printf("The temperature in celcius is: %.2f",c);
    }
}

import java.util.Scanner;

public class seven_02 {
    public static void main(String[] args) {
        float f,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter total inches: ");
        f=s.nextFloat();
        c=(float) (0.0254*f);
        System.out.printf("The value in meter is: %0.2f",c);
    }
}

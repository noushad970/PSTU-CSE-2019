import java.util.Scanner;

public class seven_08 {
    public static void main(String[] args) {
        int dig;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number: ");
        dig=s.nextInt();
        System.out.println(("The Square value is: "+dig*dig));
        System.out.println(("The Cube value is: "+dig*dig*dig));
        System.out.println(("The Fourth Power value is: "+dig*dig*dig*dig));
        
    }
}

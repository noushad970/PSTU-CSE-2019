import java.util.Scanner;

public class seven_13 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int divi,div;
        System.out.println("Enter a Divident");
        divi=S.nextInt();
        System.out.println("Enter a Divisor");
        div=S.nextInt();
        System.out.println("The Division is: "+(divi/div)+" and The Modulas is: "+(divi%div));
         
    }
}

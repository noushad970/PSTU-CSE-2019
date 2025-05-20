import java.util.Scanner;

public class four_3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter first digit: ");
        a=s1.nextInt();
        System.out.println("Enter Second digit: ");
        b=s1.nextInt();
        System.out.println("Enter Third digit: ");
        c=s1.nextInt();
        if(a<b && b<c)
        System.out.println("true");
        else
        System.out.println("false");
    }
}

import java.util.Scanner;

public class four_12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first digit: ");
        a=s.nextInt();
        System.out.println("Enter Second digit: ");
        b=s.nextInt();
        System.out.println("Enter Third digit: ");
        c=s.nextInt();
        if(a>=20 && Math.abs(b-c)>a)
        System.out.println("true");
        if(b>=20 && Math.abs(a-c)>b)
        System.out.println("true");
        if(c>=20 && Math.abs(b-a)>c)
        System.out.println("true");
        else
        System.out.println("false");

    }
}

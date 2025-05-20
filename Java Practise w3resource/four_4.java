import java.util.Scanner;

public class four_4 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter first digit: ");
        a=s1.nextInt();
        System.out.println("Enter Second digit: ");
        b=s1.nextInt();
        System.out.println("Enter Third digit: ");
        c=s1.nextInt();
        int ans=0;
        int x,y,z;
        x=a%10;
        y=b%10;
        z=c%10;
        if(x==y || x==z || y==z)
        System.out.println("true");
        else
        System.out.println("false");
    }
}

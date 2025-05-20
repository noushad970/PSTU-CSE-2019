import java.util.Scanner;

public class four_13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter value 1:");
        int a=s.nextInt();
        System.out.println("enter value 2:");
        int b=s.nextInt();
        if(a==b)
        System.out.println("0");
        else if(a%6==b%6)
        {
            if(a>b)
            System.out.println(b);
            else
            System.out.println(a);
        }
        else if(a>b)
        System.out.println(a);
        else if(b>a)
        System.out.println(b);
        
    }
}

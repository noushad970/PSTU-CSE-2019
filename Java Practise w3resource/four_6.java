import java.util.Scanner;

public class four_6 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter law limit: ");
        a=s1.nextInt();
        System.out.println("Enter max limit: ");
        b=s1.nextInt();
        System.out.println("Enter p : ");
        c=s1.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i%c==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}

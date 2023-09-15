import java.util.Scanner;

public class four_15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter value 1:");
        int a=s.nextInt();
        System.out.println("enter value 2:");
        int b=s.nextInt();
        int x=b;
        int i=1,ans=0;
        while(true)
        {
            b=i*b;
            if(b+x>=a)
            {
                ans=a-b;
                break;
            }
            i++;

        }
        System.out.println("The modulation is: ");
        System.out.println(ans);
    }
}

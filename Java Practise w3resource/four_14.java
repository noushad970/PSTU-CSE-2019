import java.util.Scanner;

public class four_14 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter value 1:");
        int a=s.nextInt();
        System.out.println("enter value 2:");
        int b=s.nextInt();
        int x=a,y=b;
        int ans=0;
        if((a<25 || a>75) && (b<25 || b>75))
        System.out.println("false");
        else
        {
            int d,f;
            while(x!=0 || y!=0)
            {
                d=x%10;
                x/=10;
                f=y%10;
                y/=10;
                if(d==f)
                {
                    ans++;
                break;
                }
            }
            if(ans>0)
            System.out.println("true");
            else
            System.out.println("false");

        }
    }
}

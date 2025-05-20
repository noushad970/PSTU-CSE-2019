import java.util.Scanner;

public class six_10 {
    public static void main(String[] args) {
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n=s.nextInt();
        int ans=0;
        int x=1;
        while(x<=n)
        {
            if(Math.pow(4, x)==n)
            ans++;
            x++;
        }
        if(ans>0)
        System.out.println("True");
        else
        System.out.println("False");
    }
}

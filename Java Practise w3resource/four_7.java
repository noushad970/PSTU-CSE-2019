import java.util.Scanner;

public class four_7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            ans++;
        }
        System.out.println(ans);
    }
}

import java.util.Scanner;

public class six_07 {
    public static void main(String[] args) {
        int ans=0;
        System.out.println("Enter Array size:");
        int n;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i+2]>a[i+1] && a[i+1]>a[i])
            {
                ans++;
                break;
            }
        }
        if(ans>0)
        System.out.println("True");
        else
        System.out.println("False");
    }
}

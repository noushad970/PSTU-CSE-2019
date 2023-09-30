import java.util.Scanner;

public class six_02 {
    public static void main(String[] args) {
        System.out.println("Enter Array size:");
        int n;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        int[] a= new int[n];
        int x=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==10 || a[i]==30){
            System.out.println("True");
            x++;
        break;
        }
        if(x==0)
        System.out.println("False");
        }
    }
}

import java.util.Scanner;

public class five_24 {
    public static void main(String[] args) {
        System.out.println("Enter Arrays size: ");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==1)
            System.out.println(a[i]);
        }    
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            System.out.println(a[i]);
        }    
    }
}

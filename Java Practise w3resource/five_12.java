import java.util.Scanner;

public class five_12 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter Array's value: ");
        for(int i=0;i<n;i++)
        {
            
            a[i]=s.nextInt();
        }
        int m;
        if(n%2==1)
        m= n/2+1;
        else
        m=n/2;
        if(a[0]>a[m] && a[0]>a[n-1])
        System.out.println("Maximum is: "+a[0]);
        else if(a[n-1]>a[m] && a[n-1]>a[0])
        System.out.println("Maximum is: "+a[n-1]);
        else
        System.out.println("Maximum is: "+a[m]);
        
    }
}

import java.util.Scanner;

public class six_13 {
    public static void main(String[] args) {
        System.out.println("Enter First Array size:");
        int n1,n2;
        Scanner s= new Scanner(System.in);
        n1=s.nextInt();
        int[] a= new int[n1];
        System.out.println("Enter first array's value: ");
        for(int i=0;i<n1;i++)
        {
            a[i]=s.nextInt();
        }
        
        System.out.println("Enter Second Array size:");
        n2= s.nextInt();
        int[] b= new int[n2];
        System.out.println("Enter Second array's value: ");
        for(int i=0;i<n2;i++)
        {
            b[i]=s.nextInt();
        }
        merge(n1,n2,a,b);
        
    }
    static void merge(int n1,int n2,int a[],int b[])
    {
        int n=n1+n2;
        int[] arr= new int[n];
        for(int i=0;i<n1;i++)
        arr[i]=a[i];
        int x=0;
        for(int i=n1;i<n;i++)
        {arr[i]=b[x];
        x++;}
        for(int i: arr)
        System.out.print(i+" ");
    }
}

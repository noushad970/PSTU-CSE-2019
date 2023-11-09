import java.util.Scanner;

public class nine_01 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n;
        System.out.println("Enter array size:");
        n=s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int x;
                if(a[i]>a[j])
                {
                    x=a[i];
                    a[i]=a[j];
                    a[j]=x;
                }
            }
        } 
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}

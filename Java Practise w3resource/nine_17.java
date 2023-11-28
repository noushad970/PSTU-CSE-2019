import java.util.Scanner;

public class nine_17 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter array size");
        int n=s.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int x;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    x=a[i];
                    a[i]=a[j];
                    a[j]=x;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[0]>a[i])
            {
                System.out.println("Second Maximum number is :" +a[i]);
                break;
            }
        }
        
    }   
}

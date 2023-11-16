import java.util.Scanner;

public class nine_07 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n;
        System.out.println("Enter array size:");
        n=s.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[n-1];
        System.out.println("Enter the array's elements:");
        for(int i=0;i<n;i++){
        a[i]=s.nextInt();
        }
        System.out.println("Enter the value you want to remove in array:");
        int x=s.nextInt();
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(x!=a[i])
            {
                b[j]=a[i];
                j++;
            }
            
        }
        for(int i=0;i<n-1;i++)
        System.out.print(b[i]+" ");
        

    
    }
}
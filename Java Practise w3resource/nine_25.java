import java.util.Scanner;
import java.util.LinkedList;

public class nine_25 {
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       System.out.println("Enter Array size: ");
       int n=s.nextInt();
       System.out.println("Enter a sorted array: (Non-Decreasing)");
       int[] a= new int[n];
       for(int i=0;i<n;i++)
       a[i]=s.nextInt();
       boolean isSorted=true;
       for(int i=0;i<n;i++)
       {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                isSorted=false;
                break;
            }
        }
       }
       if(!isSorted)
       System.out.println("The array is not sorted");
       else
       {
        System.out.println("Duplicate value's are: ");
        for(int i=0;i<n;i++)
       {
        for(int j=i+1;j<n;j++)
        {
        if(a[i]==a[j])
        {
            System.out.println(a[i]);
            break;
        }    
        }
       }
       }
    }
}

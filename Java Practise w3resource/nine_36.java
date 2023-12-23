import java.util.LinkedList;
import java.util.Scanner;

public class nine_36 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size: ");
        int n=s.nextInt();
        //LinkedList<Integer> list= new LinkedList<>();
        int[] a= new int[n];
        System.out.println("Enter array's value: ");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }  
        System.out.println("Enter your targeted value: ");
        int target=s.nextInt(); 
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(a[i]+a[j]+a[k]==target)
                    System.out.println("Value's are: "+a[i]+" "+a[j]+" "+a[k]);
                }
            }
        }
    }
}

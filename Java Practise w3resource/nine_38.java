import java.util.Arrays;
import java.util.Scanner;

public class nine_38 {
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
        int max=0,majority =0;
        int x=1;
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    x++;
                    System.out.print(x+" ");
                }
                else 
                {
                    
                    if(x>max)
                    {
                        max=x;
                        majority=a[i];
                    }}
                    x=1;
            }
        }
        System.out.println("Majority element is: "+majority+" which is present in the array for: "+max+" time");
       
    }
}

import java.util.LinkedList;
import java.util.Scanner;

public class nine_29 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size: ");
        int n=s.nextInt();
        LinkedList<Integer> list= new LinkedList<>();
        int[] a= new int[n];
        System.out.println("Enter array's value: ");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int x;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j]){
                x=a[i];
                a[i]=a[j];
                a[j]=x;
                    
            }
            }
        }
        int totalEle=0;
        for(int i=1;i<n-1;i++)
        {
            if(a[i]!=a[0] || a[i]!=a[n-1])
            {
                list.add(a[i]);
                totalEle++;
            }
        }
        
        int sum=0;
        for(int i: list)
        {
            sum+=i;
        }
        double avg=(double)sum/(double)totalEle;
        System.out.println("the average value of an array of integers\nexcept the largest and smallest values:"+avg);
    }
}

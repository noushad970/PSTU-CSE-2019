import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class nine_22 {
    public static void main(String[] args) {
       HashMap<Integer,Integer> map= new HashMap<>();
       System.out.println("Enter Array size: ");
       Scanner s= new Scanner(System.in);
       int n= s.nextInt();
       System.out.println(  "Enter array's value: ");
       int [] a= new int[n];
       for(int i=0;i<n;i++)
       a[i]=s.nextInt();
       System.out.println("Enter the targeted integet which sum you want: ");
       int targeted= s.nextInt();
       for(int i=0;i<n-1;i++)
       {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]+a[j]==targeted)
            map.put(a[i],a[j]);
        }
       }  
       System.out.println("Total pair of sum "+targeted);
       for(Map.Entry<Integer,Integer>e:map.entrySet())
       {
        System.out.println(e.getKey()+" "+e.getValue());
       }
    }
}

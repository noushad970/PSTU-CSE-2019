import java.util.*;
public class six_14 {
    public static void main(String[] args) 
    {
        String x;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a String : ");
        x= s.nextLine();
        swap(x);
}
static void swap(String x)
{
    char[] a= x.toCharArray();
        int n=a.length/2;
        char[] a1= new char[a.length];
        int x1=0;
        for(int i=n;i<a.length;i++)
        {
            a1[x1]=a[i];
            x1++;
        }
        for(int i=0;i<n;i++)
        {
            a1[x1] =a[i];
            x1++;   
        }
        for(int i=0;i<a.length;i++)
        System.out.print(a1[i]+" ");
}
   
       
}

import java.util.Scanner;

public class five_11 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter Array's value: ");
        for(int i=0;i<n;i++)
        {
            
            a[i]=s.nextInt();
        }
        System.out.println("Before Swap");
        for(int i: a)
        System.out.println(i);
        int temp;
        temp=a[0];
        a[0]=a[n-1];
        a[n-1]=temp;
        System.out.println("After Swap");
        for(int i: a)
        System.out.println(i);    
    }
}

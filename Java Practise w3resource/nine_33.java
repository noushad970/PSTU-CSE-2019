import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class nine_33 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=s.nextInt();
        System.out.println("Enter array's elements: ");
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        Set<Integer> set= new HashSet(); 
        for(int i=0;i<n;i++)
        set.add(a[i]);
        System.out.println(set);
    }
}

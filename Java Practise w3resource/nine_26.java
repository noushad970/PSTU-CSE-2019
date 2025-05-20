import java.util.LinkedList;
import java.util.Scanner;

public class nine_26 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=s.nextInt();
        LinkedList<Integer>list=new LinkedList<>();
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            list.add(a[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            list.add(a[i]);
        }
        for(int e: list)
        System.out.print(e+" ");
        

    }   
}

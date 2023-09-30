import java.util.Scanner;

public class six_05 {
    public static void main(String[] args) {
        System.out.println("Enter Array size:");
        int n;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        int[] a= new int[n];
        int x=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        if(a[0]==a[a.length-1])
        System.out.println("True");
        else
        System.out.println("False");
    }
}

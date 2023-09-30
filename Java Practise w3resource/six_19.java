import java.util.Scanner;

public class six_19 {
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
        System.out.println("Enter the integer you want to find:");
        int n1=s.nextInt();
        int x1=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==n1)
            {x1=i;
            break;}
        }
        if(x1!=0)
        System.out.println("index number is: "+x1);
        else
        System.out.println("-1");

    }
}

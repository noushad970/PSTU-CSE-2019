import java.util.Scanner;

public class one_13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=s.nextInt();
        int x=n;
        int sum=n;
        System.out.print(n+" ");
        for(int i=0;i<2;i++)
        {
            
            
            n=n*10+x;
            System.out.print(n+" ");
            sum=sum+n;
        }
        System.out.println();
        System.out.println("The result is: "+sum);

    }
}

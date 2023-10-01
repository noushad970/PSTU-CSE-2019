import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Your raw number: ");
        int n=s.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            System.out.print(" ");
            for(int j=0;j<n-i;j++)
            {
                if(i==0 || i==n-1 ||j==0 || j==n-i-1 )
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            
            System.out.println();
        }

    }
}

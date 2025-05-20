import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of Raw");
        int n=s.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=n-i;j>=1;j--)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            System.out.print(j+" ");
            System.out.println();
        }
    }
}

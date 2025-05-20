import java.util.Scanner;

public class pattern02 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of Raw");
        int n=s.nextInt();
        for(int i=n;i>=0;i--)
        {
            for(int j=n-i;j>=0;j--)
            System.out.print("  ");
            for(int j=0;j<i;j++)
            System.out.print("* ");
            System.out.println();
        }
    }
}

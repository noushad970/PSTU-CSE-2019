import java.util.Scanner;

public class pattern09 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of raw: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            System.out.print("* ");
            System.out.println();
        }
        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--)
            System.out.print("* ");
            System.out.println();
        }
    }
}

import java.util.Scanner;
class Pattern{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<n;j++)
            System.out.print("* ");
            System.out.println();
        }

    }
}
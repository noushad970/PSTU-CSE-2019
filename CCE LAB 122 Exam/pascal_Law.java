import java.util.Scanner;
public class pascal_Law {
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter Number of lines: ");
    int n= s.nextInt();
    for(int i=0;i<n;i++)
    {
        for(int j=1;j<n-i;j++)
        System.out.print(" ");
        int number=1;
        for(int k=0;k<=i;k++)
        {
            System.out.print(number+" ");
            number=number*(i-k)/(k+1);
        }
        System.out.println();
    }
    }

}

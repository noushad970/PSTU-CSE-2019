import java.util.Scanner;

public class six_12 {
    public static void main(String[] args) {
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n=s.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        fact*=i;
        System.out.println("The factorial of "+n+" is "+fact);
    }
}

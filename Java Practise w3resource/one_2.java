import java.util.Scanner;

public class one_2 {
    public static void main(String[] args) {
        int n;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n=s1.nextInt();
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        System.out.println("The sum the digits is : "+ sum);

    }
}

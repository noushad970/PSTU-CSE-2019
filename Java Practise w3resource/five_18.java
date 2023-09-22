import java.util.Scanner;

public class five_18 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int sum=0;
        while(n!=0)
        {
            sum=sum+n%10;
            n/=10;
        }
        System.out.println("The sum of the digits: "+sum);
        int sum1=0;
        while(sum!=0)
        {
            sum1=sum1+sum%10;
            sum/=10;
        }
        System.out.println("The sum of the digits sum: "+sum1);
    }
}

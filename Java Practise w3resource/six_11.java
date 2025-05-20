import java.util.Scanner;

public class six_11 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter First integer: ");
        n1=s.nextInt();
        System.out.println("Enter Second integer: ");
        n2=s.nextInt();
        int sum=n1;
        for(int i=0;i<n2;i++)
        sum++;
        System.out.println("The sum is : "+sum);
        
    }
}

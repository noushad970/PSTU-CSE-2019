import java.util.Scanner;

public class six_15 {
    public static void main(String[] args) {
        int n;
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        n=s.nextInt();
        int org=n;
        int rev=0;
       while(n!=0)
       {
        rev=rev*10+n%10;
        n=n/10;
       }
       if(org==rev)
       System.out.println("True");
       else
       System.out.println("False");
    }
}

import java.util.Scanner;

public class seven_03 {
    public static void main(String[] args) {
        int f,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number: ");
        f=s.nextInt();
        int sum=0;
        while(f!=0)
        {
            sum=sum+f%10;
            f=f/10;
        }
        System.out.println("THe sum of digits: "+sum);
    }
}

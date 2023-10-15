import java.util.Scanner;

public class seven_09 {
    public static void main(String[] args) {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first Number: ");
        a=s.nextInt();
        System.out.println("Enter Second Number: ");
        b=s.nextInt();
        int max,min;
        
        if(a>b)
        {
            max=a;
            min=b;
        }
        else
        {max=b;
        min=a;}
        System.out.println("Sum: "+(a+b));
        System.out.println("Difference: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("The average: "+((a+b)/2));
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}

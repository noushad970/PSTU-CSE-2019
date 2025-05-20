import java.util.Scanner;
public class one_twelbth {
    public static void main(String[] args) {
        float a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First value:");
        a=s.nextFloat();
        System.out.println("Enter Second value:");
        b=s.nextFloat();
        System.out.println("Enter Third value:");
        c=s.nextFloat();
        float avg=(a+b+c)/3;
        System.out.println("The average of three value is: "+avg);
    }
}

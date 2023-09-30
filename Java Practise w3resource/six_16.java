import java.util.Scanner;

public class six_16 {
    public static void main(String[] args) {
        for(int i=1;i<100;i++)
        {
            if(i%3==0 && i%5==0)
            System.out.println("For "+i+" = "+"Fizz Buzz");
            else if(i%3==0 )
            System.out.println("For "+i+" = "+"Fizz");
            else if(i%5==0)
            System.out.println("For "+i+" = "+"Buzz");
        }
    }
}

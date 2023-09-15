import java.util.Scanner;

public class one_10 {
    public static void main(String[] args) {
        System.out.println("Enter the character: ");
        Scanner s=new Scanner(System.in);
        String c=s.next();
        int x=c.codePointAt(0);
        
        System.out.println("The ASCII value of the character "+c+" is: " +x);
        
    }
}

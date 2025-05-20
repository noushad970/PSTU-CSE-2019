import java.util.Scanner;

public class one_6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s1=s.nextLine();
        StringBuffer sb= new StringBuffer(s1);
       sb.reverse();
       System.out.println("The reverse string is: "+sb);
       System.out.println(sb);
        
    }
}

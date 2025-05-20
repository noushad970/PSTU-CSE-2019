import java.util.Scanner;
public class twelve_05 {
    public static void main(String[] args) throws Exception {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the first string : ");
    String x1=s.nextLine();
    System.out.println("Enter the substring what you want to find in string 1: ");
    String x2=s.nextLine();
    boolean answer=x1.contains(x2);
    System.out.println(answer);
    
}
}

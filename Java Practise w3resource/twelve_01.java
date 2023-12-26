import java.util.Scanner;
public class twelve_01 {
    public static void main(String[] args) throws Exception {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the string: ");
    String x=s.nextLine();
    System.out.println("Enter the index number: ");
    int n=s.nextInt();
    System.out.println(x.charAt(n-1));
    }
}

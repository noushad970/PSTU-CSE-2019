import java.util.Scanner;
public class twelve_02 {
    public static void main(String[] args) throws Exception {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the string: ");
    String x=s.nextLine();
    System.out.println("Enter the index number: ");
    int n=s.nextInt();
    if (n >= 0 && n < x.length()) {
        
        int ans = x.codePointAt(n);

        System.out.println("Unicode code point at index " + n + ": " + ans);
    } else {
        System.out.println("Invalid index. Please enter a valid index within the string length.");
    }
    }
}

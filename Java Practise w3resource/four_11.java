import java.util.Scanner;

public class four_11 {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        char[] a=n.toCharArray();
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
    }
}

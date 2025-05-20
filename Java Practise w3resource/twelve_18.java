import java.util.Scanner;
public class twelve_18
{
    
    public static void main(String[] args) {
    Scanner S= new Scanner(System.in);
    System.out.println("Enter a string :");
    String str = S.nextLine();
    int unqValue = str.hashCode();
    System.out.println(unqValue);

    }
}

import java.util.Scanner;

public class twelve_24
{
    
    public static void main(String[] args) {
    String str=new String("The quick brown fox jumps over the lazy dog.");
    System.out.println(str);
    Scanner s=new Scanner(System.in);
    String str1;
    System.out.println("Enter the string you want to remove:");
    str1=s.nextLine();
    System.out.println("Enter the string you want to add:");
    String str2=s.nextLine();
    System.out.println(str.replace(str1, str2));
    
    
}
}

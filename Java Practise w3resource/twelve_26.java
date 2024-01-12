import java.util.Scanner;

public class twelve_26
{
    
    public static void main(String[] args) {
    
    //System.out.println(str);
    
    Scanner s=new Scanner(System.in);
    System.out.println("enter a string");
    String str=s.nextLine();
    String str1;
    System.out.println("Start with: ");
    str1=s.nextLine();
    int j=0;
    boolean answer=false;
    answer=str.startsWith(str1);
    
    
    System.out.println(answer);
    
    
    
}
}

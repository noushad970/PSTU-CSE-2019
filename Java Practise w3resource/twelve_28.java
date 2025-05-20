import java.util.Scanner;

public class twelve_28
{
    
    public static void main(String[] args) {
    
    //System.out.println(str);
    
    Scanner s=new Scanner(System.in);
    System.out.println("enter a string");
    String str=s.nextLine();
    char[] c= new char[str.length()];
    for(int i=0;i<str.length();i++)
    {
        c[i]=str.charAt(i);
    }
    for(int i=0;i<c.length;i++)
    {
        System.out.print(c[i]);
    }

    
    
    
}
}

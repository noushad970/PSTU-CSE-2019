import java.util.Scanner;

public class four_20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String s1=s.nextLine();
        System.out.println("Enter String 2: ");
        String s2=s.nextLine();
        String sf;
        if(s1.length()>s2.length())
        {
            sf=s2+s1+s2;
            System.out.println(sf);
        }else if(s1.length()<s2.length())
        {
            sf=s1+s2+s1;
            System.out.println(sf);
        }
        else 
        System.out.println("String are in same lenght");
    }
}

import java.util.Scanner;

public class five_16 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a=s.nextLine();
        char[] x=a.toCharArray();
        int n=a.length();
        if(x[0]>='A' && x[0]<='Z')
        System.out.println("True");
        else
        System.out.println("False");
    }
}

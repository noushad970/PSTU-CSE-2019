import java.util.Scanner;

public class four_1 {
    public static void main(String[] args) {
        String s;
        System.out.println("Enter the number in String");
        Scanner s1=new Scanner(System.in);
        s=s1.nextLine();
        char[] a=s.toCharArray();
        System.out.println("The integer value is: ");
        for(int i=0;i<a.length;i++)
        {
            int x=a[i]-48;
            System.out.print(x);
        }
    }
}

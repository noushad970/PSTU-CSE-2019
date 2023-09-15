import java.util.Scanner;

public class four_19 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        String s=s1.nextLine();
        char[] a=s.toCharArray();
        for(int i=0;i<a.length/2;i++)
        System.out.print(a[i]);
    }
}

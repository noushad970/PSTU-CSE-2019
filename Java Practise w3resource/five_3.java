import java.util.Scanner;
public class five_3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a1=s.nextLine();
        String a2=s.nextLine();

        char[] s1=a1.toCharArray();
        char[] s2=a2.toCharArray();
        int x=a2.length()-1;
        if(a1.length()==0)
        System.out.print("#");
        else
        System.out.print(s1[0]);
        if(a2.length()==0)
        System.out.print("#");
        else
        System.out.print(s2[x]);
    }
}

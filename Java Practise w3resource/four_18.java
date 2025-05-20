import java.util.Scanner;

public class four_18 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        String s=s1.nextLine();
        char[] x=s.toCharArray();
        for(int i=0;i<4;i++)
        {
            for(int j=x.length-3;j<x.length;j++)
            System.out.print(x[j]);
        }
    }
}

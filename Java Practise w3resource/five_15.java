import java.util.Scanner;

import javax.script.ScriptContext;

public class five_15 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a=s.nextLine();
        char[] x=a.toCharArray();
        int n=a.length();
        for(int i=n-4;i<n;i++)
        System.out.print(x[i]);
        System.out.print(a);
        for(int i=n-4;i<n;i++)
        System.out.print(x[i]);
    }
}

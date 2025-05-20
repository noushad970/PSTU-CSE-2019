import java.util.Scanner;

public class four_17 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        char[] a=n.toCharArray();
        for(int i=0;i<n.length();i++)
        {
            
            if(a[i]==' ')
            System.out.print(" Tutorial ");
            else
            System.out.print(a[i]);
        }
    }
}

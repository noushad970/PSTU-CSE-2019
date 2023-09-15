import java.util.Scanner;

public class four_8 {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        //StringBuffer x=new StringBuffer(n);
        char[] a=n.toCharArray();
        a[0]=Character.toUpperCase(a[0]);
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==' ')
            {
                a[i+1]= Character.toUpperCase(a[i+1]);
            }           
        }
        for(char x:a)
        {
            System.out.print(x);
        }
    }
}

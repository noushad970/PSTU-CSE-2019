import java.util.Scanner;

public class four_9 {
    public static void main(String[] args) {
        System.out.println("Enter the String in UpperCase: ");
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        char[] a=n.toCharArray();
        
        for(int i=0;i<a.length;i++)
        {
           
                a[i]= Character.toLowerCase(a[i]);
                      
        }
        for(char x:a)
        {
            System.out.print(x);
        }
    }
}

import java.util.Scanner;
public class one_seven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=s.nextInt();
        System.out.println("The multiplication table of "+a+" is:");
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+" x "+i+" = "+a*i);
        }
        
    }
}

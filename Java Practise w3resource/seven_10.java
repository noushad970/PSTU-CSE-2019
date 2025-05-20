import java.util.Scanner;

public class seven_10 {
    public static void main(String[] args) {
        int dig;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number: ");
        dig=s.nextInt();
        int x=dig;
        int y=0;
        while(dig!=0)
        {
            y=y*10+dig%10;
            
            dig=dig/10;
        }
        while(y!=0)
        {
            System.out.print(y%10+" ");
            y=y/10;
        }
    }
}

import java.util.Scanner;

public class one_1 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x= s1.nextInt();
        System.out.println("Enter the value of x:");
        int y=s1.nextInt();
        if(x>y)
        System.out.println(x+" > "+y);
        if(x<y)
        System.out.println(x+" < "+y);
        if(x!=y)
        System.out.println(x+" != "+y);
        if(x>=y)
        System.out.println(x+" >= "+y);
        if(x<=y)
        System.out.println(x+" <= "+y);
        if(x==y)
        System.out.println(x+" = "+y);
    }
}

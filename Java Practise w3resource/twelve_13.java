import java.util.Scanner;
public class twelve_13 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String x1=s.nextLine();
        System.out.println("Enter the 2nd string: ");
        String x2=s.nextLine();
        String x3=x1.toLowerCase();
        String x4=x2.toLowerCase();
        if(x3.equals(x4))
        System.out.println("true");
        else
        System.out.println("false");
    
}
}

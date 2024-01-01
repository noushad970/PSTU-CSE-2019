import java.util.Scanner;
public class twelve_06 {
    public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the first string : ");
    String x1=s.nextLine();
    System.out.println("Enter the 2nd string: ");
    String x2=s.nextLine();
    if(x1.equals(x2)){
        System.out.println("true");
    }
    else
    System.out.println("false");
    
}
}

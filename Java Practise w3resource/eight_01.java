import java.util.Scanner;

public class eight_01 {
   public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter number:");
    int n=s.nextInt();
    if(n>0)
    System.out.println("Number is positive");
    else if(n<0)   
    System.out.println("Number is Negative");
    else
    System.out.println("Number is zero");
 
   } 
}

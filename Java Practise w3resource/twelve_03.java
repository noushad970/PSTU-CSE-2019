import java.util.Scanner;
import java.util.StringTokenizer;
public class twelve_03 {
    public static void main(String[] args) throws Exception {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the first string : ");
    String x1=s.nextLine();
    System.out.println("Enter the second string : ");
    String x2=s.nextLine();
    int n=x1.compareTo(x2);
    if(n==0)
    System.out.println("The strings are equal ");
    else if(n<0)
    System.out.println(x1+" is less than "+x2);
    else if(n>0) 
    System.out.println(x1+" is greater than "+x2);
    
    
}
}

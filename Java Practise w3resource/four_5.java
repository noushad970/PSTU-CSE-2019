import java.util.Scanner;

public class four_5 {
 public static void main(String[] args) {
    System.out.println("Enter total seconds: ");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int min,sec,hour;
    min=n/60;
    sec=n%60;
    hour=min/60;
    int min1=min%60;
    System.out.println(hour+":"+min1+":"+sec);

 }   
}

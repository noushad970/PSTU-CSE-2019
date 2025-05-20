import java.util.Scanner;

public class seven_04 {
    public static void main(String[] args) {
        int min,days,year;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number: ");
        min=s.nextInt();
        days=min/(60*24);
        year=days/365;
        days=days%365;
        System.out.println("Total years: "+year+" and total Days: "+days);
    }
}

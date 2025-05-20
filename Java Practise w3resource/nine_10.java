import java.util.ArrayList;
import java.util.Scanner;
public class nine_10 {
    public static void main(String[] args) {
       ArrayList <Integer> list =new ArrayList<>();
       System.out.println("Enter Array size: ");
       Scanner s= new Scanner(System.in);
       int n=s.nextInt();
       System.out.println("Enter array's elements: ");
       int max=0;
       int min=10000000;
       for(int i=0;i<n;i++)
       {
        int f=s.nextInt();
        list.add(f);
        if(f>max)
        max=f;
        if(f<min)
        min=f;

       }
       System.out.println("Max Value is: "+max );
       System.out.println("Minimum Value is: "+min ); 
    }
}

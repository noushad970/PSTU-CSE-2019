import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Exceptions{
    public static void main(String[] args)
    {
        /*while (true)
        {
            try{
                int n1,n2;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number 1:");
        n1=s.nextInt();
        System.out.println("Enter number 2:");
        n2=s.nextInt();
                int result=n1/n2;
                System.out.println("Result: " + result);
               break;
            }catch(Exception e){
                System.out.println("Exception: " + e);
                System.out.println("Warning Please enter an integer Greater or Smaller than 0");
            }
          
        }
        char c= 'D';
        int a=c-64;
        System.out.println(a);
        double d=12.333312121;
        DecimalFormat dx= new DecimalFormat("0.000");
        System.out.println(dx.format(d));*/
        ArrayList<Integer> x= new ArrayList<>();
        x.add(21);
        x.add(212);
        x.add(211);
        x.add(51);
        x.add(1);
        x.add(251);
        x.add(121);
        x.add(29);
       Collections.sort(x);
       System.out.println(x); 
        Collections.sort(x,Collections.reverseOrder());
        System.out.println(x);

    }
}
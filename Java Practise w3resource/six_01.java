import java.util.Scanner;

public class six_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a= new int[20];
        System.out.println("Enter 20 array elements value's:");
        for(int i=0;i<20;i++)
        {   
            a[i]=s.nextInt();
        } 
        if(a[9]>a[19])
        System.out.println("True");
        else
        System.out.println("False");
    }
}

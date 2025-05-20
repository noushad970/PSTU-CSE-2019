import java.util.Scanner;

public class five_14 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=s.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        int[] a3 = new int[n];
        System.out.println("Enter 1st Array's value: ");
        for(int i=0;i<n;i++)
        {
            
            a1[i]=s.nextInt();
        }
        System.out.println("Enter 2nd Array's value: ");
        for(int i=0;i<n;i++)
        {
            
            a2[i]=s.nextInt();
        }
        System.out.println("Multiplication of 2 array's each elements: ");
        for(int i=0;i<n;i++)
        {
            
            a3[i]=a1[i]*a2[i];
            System.out.print(a3[i]+" ");
        }
        
    }
}

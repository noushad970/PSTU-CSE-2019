import java.util.Scanner;

public class nine_08 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n;
        System.out.println("Enter array size:");
        n=s.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter the array's elements:");
        for(int i=0;i<n;i++){
        a[i]=s.nextInt();
        }
        
        b=a; 
        
        for(int i=0;i<n;i++)
        System.out.print(b[i]+" ");
        

    
    }
}
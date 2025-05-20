import java.util.Scanner;

public class nine_02 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n;
        System.out.println("Enter array size:");
        n=s.nextInt();
        int sum=0;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
        a[i]=s.nextInt();
            sum+=a[i];
    }
    System.out.println("Sum is: "+sum);
    
    }
}
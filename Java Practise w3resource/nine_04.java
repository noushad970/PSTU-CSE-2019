import java.util.Scanner;

public class nine_04 {
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
    float avg=(float)sum/n;
    System.out.println("Average is: "+avg);
    
    }
}
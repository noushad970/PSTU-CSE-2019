import java.util.Scanner;

public class nine_05 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n;
        System.out.println("Enter array size:");
        n=s.nextInt();
        
        int[] a = new int[n];
        System.out.println("Enter the array's elements:");
        for(int i=0;i<n;i++){
        a[i]=s.nextInt();
        }
        System.out.println("Enter the value you want to find in array:");
        int x=s.nextInt();
        boolean ishere=false;
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(x==a[i]){
            ishere=true;
            index=i+1;}
        }
        if(ishere==true)
        System.out.println("The value "+x+ " is present on the array\n");
        else
        System.out.println("The value is not present");

    
    }
}
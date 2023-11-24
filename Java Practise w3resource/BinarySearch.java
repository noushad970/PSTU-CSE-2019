import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n;
        System.out.println("Enter The array size: ");
        n=s.nextInt();
        int[] a= new int[n];
        System.out.println("Enter array's elements: ");

        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int left,right,mid;
        left=0;
        right=n-1;
       int sum=0;

        System.out.println("Enter the number you find: ");
        int x=s.nextInt();
        while(true)
        {
            mid=(left+right)/2;
            if(x>a[mid])
            {
                left=mid+1;
                
            }
            if(x<a[mid])
            {
                right=mid-1;
            }
            if(x==a[mid])
            {
                System.out.println("The number is found.\n"+"The index number is: "+mid);
                System.out.println("Total number of loop round: "+sum);
                break;
            }
            if(left>right)
            break;
            sum++;
        }

    }
}

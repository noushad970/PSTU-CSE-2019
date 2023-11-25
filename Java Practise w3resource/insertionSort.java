import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=s.nextInt();
        int a[]= new int[n];
        System.out.println("Enter Array's elements: ");
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        InsertionSort(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    private static void InsertionSort(int[] a, int n) {
        int key,j;
        for(int i=1;i<=n-1;i++)
        {
            key=a[i];
            j=i-1;
            while (a[j]>key && j>=0) {
             a[j+1]=a[j];
             j--;   
            }
            a[j+1]=key;
        }
    }
}

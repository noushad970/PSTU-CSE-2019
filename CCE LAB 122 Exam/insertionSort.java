import java.util.Scanner;
public class insertionSort{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0; i<10; i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0; i<10; i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for(int x: a)
        {
            System.out.print(x+" ");
        }
    }
}
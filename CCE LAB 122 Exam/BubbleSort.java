import java.util.Scanner;
public class BubbleSort{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0; i<10; i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<10-1;i++)
        {
            for(int j=0;j<10-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int j=0;j<10;j++)
        {
            System.out.print(a[j]+" ");
        }
    }
}
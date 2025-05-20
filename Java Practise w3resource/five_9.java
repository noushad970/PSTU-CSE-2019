import java.util.Scanner;

public class five_9 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Array's value: ");
        int[] a = new int[3];
        for(int i=0;i<3;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            int temp;
            for(int j=i+1;j<3;j++)
            {
                temp= a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        for(int i: a)
        System.out.print(i+" ");
    }
}

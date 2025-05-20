import java.util.Scanner;

public class five_10 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int[] a = new int[3];
        System.out.println("Enter Array's value: ");
        for(int i=0;i<3;i++)
        {
            
            a[i]=s.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            int temp;
            for(int j=i+1;j<3;j++)
            {
                if(a[i]<a[j])
                {temp= a[i];
                a[i]=a[j];
                a[j]=temp;}
            }
        }
        System.out.println("The max value is : "+a[0]);
    }
}

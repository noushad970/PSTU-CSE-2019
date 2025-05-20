import java.util.Scanner;

public class fice_8 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Array's value: ");
        int[] a = new int[2];
        for(int i=0;i<2;i++)
        {
            a[i]=s.nextInt();
        }
        int x=0;

        for(int i=0;i<2;i++)
        {
            if(a[i]==4 || a[i]==7)
            {
                x++;
            }
    }
    if(x>0)
    System.out.println("True");
    else System.out.println("False");
    }
}

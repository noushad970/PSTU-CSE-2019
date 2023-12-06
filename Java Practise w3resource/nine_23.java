import java.util.Scanner;

public class nine_23 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int[] b={1,2,3,4,5,6,7};
        int[] c={2,3,4,5,6,7,8};
        boolean abIsEqual,bcIsEqual,acIsEqual;
        if(a.length!=b.length)
        System.out.println("Array one is not equal to Array 2");
        else
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]!=b[i])
                System.out.println("Array one is not equal to Array 2");
                else
                System.out.println("Array one is equal to Array two");
            }
        }
        if(c.length!=b.length)
        System.out.println("Array two is not equal to Array three");
        else
        {
            for(int i=0;i<b.length;i++)
            {
                if(b[i]!=c[i])
                System.out.println("Array two is not equal to Array three");
                else
                System.out.println("Array two is equal to Array three");
            }
        }
        if(c.length!=a.length)
        System.out.println("Array one is not equal to Array three");
        else
        {
            for(int i=0;i<c.length;i++)
            {
                if(b[i]!=c[i])
                System.out.println("Array one is not equal to Array three");
                else
                System.out.println("Array one is equal to Array three");
            }
        }

    }
}

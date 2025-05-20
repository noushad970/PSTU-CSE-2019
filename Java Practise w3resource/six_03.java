import java.util.Scanner;

public class six_03 {
    public static void main(String[] args) {
       
        int[] a={2,4,6,7,10,89,8,5};
        int x=0;
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]!=10)
            x++;
            else
            break;
        }
        x=a.length- x;
        for(int i=x;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        

    }
}

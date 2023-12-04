import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class nine_21 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<10;i++){
            int x;
            x=s.nextInt();
        
        list.add(x);
        }
        Integer[] a= new Integer[list.size()];
        a=list.toArray(a);
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    }
}

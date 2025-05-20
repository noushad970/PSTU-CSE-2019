import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class nine_20 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int[] a= new int[10];
        for(int i=0;i<10;i++){

        a[i]=s.nextInt();
        list.add(a[i]);
        }
        System.out.println(list);

    }
}

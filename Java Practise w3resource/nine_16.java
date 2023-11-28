import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class nine_16 {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        System.out.println("Enter array size: ");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int x= s.nextInt();
            list.add(x);
        }
        System.out.println(list);
        
    }
}

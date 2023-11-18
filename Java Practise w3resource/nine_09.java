import java.util.ArrayList;
import java.util.Scanner;
public class nine_09 {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
        System.out.println("Enter array size: ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Enter array element: ");
        for(int i=0;i<n;i++)
        {
            int x= s.nextInt();
            a.add(x);
        }
        int index,x;
        System.out.println("Enter the index number where you want to add an element:");
        index=s.nextInt();
        System.out.println("Enter the element you want to add:");
        x=s.nextInt();
        a.add(index,x);
        System.out.println(a);
    }
}

import java.util.Scanner;

public class nine_13 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Number of word: ");
        int n= s.nextInt();
        String[] a= new String[n];
        for(int i=0;i<n;i++)
        a[i]=s.next();
        System.out.println();
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i].equals(a[j]))
                System.out.println(a[j]);
            }
        }
        
    }
}

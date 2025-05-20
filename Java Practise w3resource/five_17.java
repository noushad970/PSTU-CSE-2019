import java.util.Scanner;

public class five_17 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        while(true)
        {
            if(n%2==1)
            {
                n=n*3+1;}
            else if(n%2==0)
            n/=2;
            if(n==1)
            break;
        }
    }
}

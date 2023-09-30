import java.util.Scanner;

public class six_08 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter an integer");
        int n=s.nextInt();
        int sum=0;
        while(n!=0)
        {
            sum=sum+n%10;
            n/=10;
          
        }
        
        n=sum;
        if(sum/10!=0)
        {
            sum=0;
            while(n!=0)
            {
                sum=sum+n%10;
                n/=10;
            }
            
        }
        n=sum;
        if(sum/10!=0)
        {sum=0;
            while(n!=0)
            {
                sum=sum+n%10;
                n/=10;
            } 
            
        }
        System.out.println(sum);
    }
}

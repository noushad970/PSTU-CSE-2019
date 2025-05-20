import java.util.Scanner;

public class five_2 {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        String a=s1.nextLine();
        
        if(a.length()>2)
        {
            for(int i=0;i<a.length();i++)
            {   
                System.out.print('#');

            }
        }
        else
        System.out.println(a);
    
    }
}

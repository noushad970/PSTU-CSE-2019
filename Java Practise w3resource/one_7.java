import java.util.Scanner;

public class one_7 {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        String s;
        Scanner s1=new Scanner(System.in);
        s=s1.nextLine();
        char[] x=s.toCharArray();
        int letter=0,space=0,number=0,other=0;
        for(char i:x)
        {
            if((i>='a' && i<='z')|| (i>='A'&&i<='Z'))
            letter++;
            else if(i>='0' && i<='9')
            number++;
            else if(i==' ')
            space++;
            else
            other++;
        }
        System.out.println("Letter's Are: "+letter);
        System.out.println("Space's Are: "+space);
        System.out.println("number's Are: "+number);
        System.out.println("other's Are: "+other);
        
    }
}

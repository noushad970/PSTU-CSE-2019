import java.util.Scanner;

public class twelve_27
{
    
    public static void main(String[] args) {
    
    //System.out.println(str);
    
    Scanner s=new Scanner(System.in);
    System.out.println("enter a string");
    String str=s.nextLine();
    int startingIndex,endingIndex;
   
    System.out.println("Enter starting index :");
    startingIndex=s.nextInt();
    endingIndex=s.nextInt();
    String NewString=str.substring(startingIndex,endingIndex);
    
    
    System.out.println(NewString);
    
    
    
}
}

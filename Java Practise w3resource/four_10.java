import java.util.Scanner;

public class four_10 {
   public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Input a String: ");
        String s1 = s.nextLine();
        String[] words = s1.split("[ ]+");
        System.out.println("Answer: "+words[words.length - 2]);
   } 
}

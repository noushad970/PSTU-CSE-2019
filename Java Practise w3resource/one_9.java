import java.nio.charset.Charset;
public class one_9 {
    public static void main(String[] args) {
        System.out.println("List of available character sets: ");
        for(String i: Charset.availableCharsets().keySet())
        System.out.println(i);
        
    }
}


public class twelve_17
{
    
    public static void main(String[] args) {
        String str = "This is a sample string.";

        char[] arr = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
        str.getChars(4, 10, arr, 2);
        System.out.println("The char array equals \"" +
            arr + "\"");
    }
}

import java.util.Scanner;

public class eight_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        String input = s.nextLine();

        if (input.length() != 1) {
            System.out.println("Error: Please enter a single character.");
        } else {
            char userChar = input.charAt(0);

            if (isLetter(userChar)) {
                if (isVowel(userChar)) {
                    System.out.println(userChar + " is a vowel.");
                } else {
                    System.out.println(userChar + " is a consonant.");
                }
            } else {
                System.out.println("Error: Please enter a letter (a-z or A-Z).");
            }
        }
    }

    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Convert to lowercase to handle both upper and lower case vowels.
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

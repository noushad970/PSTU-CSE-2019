import java.util.Scanner;

public class eight_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer (less than ten billion): ");
        long number = input.nextLong();

        if (number < 0 || number >= 10_000_000_000L) {
            System.out.println("Invalid input. Please enter a positive integer less than ten billion.");
        } else {
            int digitCount = countDigits(number);
            System.out.println("The number of digits in the input is: " + digitCount);
        }
    }

    public static int countDigits(long number) {
        // Convert the number to a string and count the characters (digits).
        String numStr = String.valueOf(number);
        return numStr.length();
    }
}

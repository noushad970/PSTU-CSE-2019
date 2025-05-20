import java.util.Scanner;

public class eight_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1-7) representing a day of the week: ");
        int dayNumber = input.nextInt();

        String weekdayName = getWeekdayName(dayNumber);

        if (weekdayName != null) {
            System.out.println("The day is: " + weekdayName);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }

    public static String getWeekdayName(int dayNumber) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        if (dayNumber >= 1 && dayNumber <= 7) {
            return weekdays[dayNumber - 1];
        } else {
            return null;
        }
    }
}

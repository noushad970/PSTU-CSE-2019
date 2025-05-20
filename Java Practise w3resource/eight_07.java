import java.util.Scanner;

public class eight_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = s.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = s.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a month between 1 and 12.");
        } else {
            int days = getDaysInMonth(year, month);
            if (days == -1) {
                System.out.println("Invalid year. Please enter a valid year.");
            } else {
                System.out.println("Number of days in the month: " + days);
            }
        }
    }

    public static int getDaysInMonth(int year, int month) {
        if (year < 1 || month < 1 || month > 12) {
            return -1; // Invalid input
        }

        if (month == 2) {
            // Check for February
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            // Months with 30 days
            return 30;
        } else {
            // All other months have 31 days
            return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

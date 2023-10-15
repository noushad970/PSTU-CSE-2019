import java.math.BigInteger;
import java.util.Scanner;

public class seven_14 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a value");
        String x=s.nextLine();
        BigInteger bigInt = new BigInteger(x);

        int intValue = bigInt.intValue();
        long longValue = bigInt.longValue();
        float floatValue = bigInt.floatValue();
        double doubleValue = bigInt.doubleValue();

        System.out.println("BigInteger value: " + bigInt);
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
    }
}

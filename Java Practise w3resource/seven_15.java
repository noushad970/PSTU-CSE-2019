public class seven_15 {
    public static void main(String[] args) {
        float floatNumber = 3.14159265f;
        double doubleNumber = 2.718281828459045;
        float nextFloatUp = Math.nextUp(floatNumber);
        double nextDoubleUp = Math.nextUp(doubleNumber);
        float nextFloatDown = Math.nextDown(floatNumber);
        double nextDoubleDown = Math.nextDown(doubleNumber);
        System.out.println("Original float: " + floatNumber);
        System.out.println("Next float up: " + nextFloatUp);
        System.out.println("Next float down: " + nextFloatDown);

        System.out.println("Original double: " + doubleNumber);
        System.out.println("Next double up: " + nextDoubleUp);
        System.out.println("Next double down: " + nextDoubleDown);
    }
}

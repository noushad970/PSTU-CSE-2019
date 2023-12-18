public class nine_32 {
    public static void main(String[] args) {
        int[] numbers1 = {10, 65, 5, 77, 3};       
        int[] numbers2 = {10, 77, 5, 20, 3};       
        int[] numbers3 = {1, 2, 3, 4, 5};          

        System.out.println("Array 1: " + containsElements(numbers1, 65, 77));
        System.out.println("Array 2: " + containsElements(numbers2, 65, 77));
        System.out.println("Array 3: " + containsElements(numbers3, 65, 77));
    }

    private static boolean containsElements(int[] array, int element1, int element2) {
        boolean foundElement1 = false;
        boolean foundElement2 = false;

        for (int number : array) {
            if (number == element1) {
                foundElement1 = true;
            } else if (number == element2) {
                foundElement2 = true;
            }
        }

        return foundElement1 && foundElement2;
    }
}

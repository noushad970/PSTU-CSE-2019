public class nine_28 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 3, 8, 4, 6};

        if (numbers.length >= 1) {
            int difference = findDifference(numbers);
            System.out.println("Difference between the largest and smallest values: " + difference);
        } else {
            System.out.println("Array should have at least one element.");
        }
    }

    private static int findDifference(int[] array) {
        int min = array[0]; 
        int max = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        return max - min;
    }
}

public class nine_30 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};         
        int[] numbers2 = {1, 0, 3, 4, 5};          
        int[] numbers3 = {1, 2, -1, 4, 5};        
        int[] numbers4 = {1, 2, 3, 0, -1, 5};      

        System.out.println("Array 1: " + checkArray(numbers1));
        System.out.println("Array 2: " + checkArray(numbers2));
        System.out.println("Array 3: " + checkArray(numbers3));
        System.out.println("Array 4: " + checkArray(numbers4));
    }

    private static boolean checkArray(int[] array) {
        for (int number : array) {
            if (number == 0 || number == -1) {
                return false; 
            }
        }
        return true; 
    }
}

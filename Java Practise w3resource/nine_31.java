public class nine_31 {
 
        public static void main(String[] args) {
            int[] numbers1 = {10, 5, 10, 10, 3};      
            int[] numbers2 = {10, 10, 5, 10, 3};      
            int[] numbers3 = {1, 2, 3, 4, 5};         
    
            System.out.println("Array 1: " + checkSumOfTens(numbers1));
            System.out.println("Array 2: " + checkSumOfTens(numbers2));
            System.out.println("Array 3: " + checkSumOfTens(numbers3));
        }
    
        private static boolean checkSumOfTens(int[] array) {
            int sumOfTens = 0;
    
            for (int number : array) {
                if (number == 10) {
                    sumOfTens += number;
                }
            }
    
            return sumOfTens == 30;
        }
    }
    


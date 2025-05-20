import java.util.Arrays;

public class nine_40 {
    public static void findClosestToZeroSum(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int minSum = Integer.MAX_VALUE;
        int minLeft = 0;
        int minRight = 0;

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (Math.abs(currentSum) < Math.abs(minSum)) {
                minSum = currentSum;
                minLeft = left;
                minRight = right;
            }

            if (currentSum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Two elements with the sum closest to zero: " + arr[minLeft] + " and " + arr[minRight]);
    }

    public static void main(String[] args) {
        int[] array = {1, 60, -10, 70, -80, 85};
        findClosestToZeroSum(array);
    }
}

import java.util.*;
public class six_24 {
public static void main(String[] args) {
      int[] nums = {1,2,4,5,6};
      int t;
       t = 5;
    
      System.out.print(searchInsert(nums, t)); 
}
  public static int searchInsert(int[] nums1, int t) {
        if (nums1 == null || nums1.length == 0) {
            return 0;
        }
        int start = 0;
        int end = nums1.length - 1;
        int mid = start + (end - start)/2;

        while (start + 1 < end) {
            mid = start + (end - start)/2;
            if (nums1[mid] == t) {
                return mid;
            } else if (nums1[mid] > t) {
                end = mid;
            } else {
                start = mid;
            }
        }
        
        if (nums1[start] >= t) {
            return start;
        } else if (nums1[start] < t && t <= nums1[end]) {
            return end;
        } else {
            return end + 1;
        }
    }
}

public class five_22 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 2, 4, 9};
	int even = 0, odd = 0;
	 
	    
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] % 2 == 0)
		{         
        even++;
		}
		else
		   odd++;	
    }                 
    System.out.println("Number of even elements in the array: "+even);
	System.out.println("Number of odd elements in the array: "+odd);
	
    }
}

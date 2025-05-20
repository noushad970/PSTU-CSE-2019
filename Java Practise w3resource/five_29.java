import java.io.*; 
import java.util.*;
public class five_29 {
    public static void main(String[] args) {
        int[] ar1= {10, 11, 10, 20, 43, 20, 50};
	int[] ar2 = {10, 13, 11, 20, 44, 30, 50};
	System.out.println("Array1: "+Arrays.toString(ar1)); 
	System.out.println("Array2: "+Arrays.toString(ar2)); 
	int ctr = 0;
    
    for(int i = 0; i < ar1.length; i++) {
        if(Math.abs(ar1[i] - ar2[i]) <= 1 && ar1[i] != ar2[i])
            ctr++;
    }
                    
    System.out.printf("Number of elements: "+ctr);
	System.out.printf("\n");
    }
}

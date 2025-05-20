public class java_28 {
 public static void main(String[] args) {
    int[] a = {10, 20, 10, 20, 40, 20, 50};
	int result = 0;	
	int x = 20;
	for(int i = 0; i < a.length - 1; i++) {
        if(a[i] != x && a[i + 1] != x)
		{
           result = 1;	
		}        
    }                                   
    if (result==0)
 	  {
     	 System.out.printf( String.valueOf(true));	         
	  }
 else
	   	  {
     	 System.out.printf( String.valueOf(false));	         
	  }	
 }   
}

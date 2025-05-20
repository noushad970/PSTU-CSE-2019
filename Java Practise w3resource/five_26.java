public class five_26 {
 public static void main(String[] args) {
    int[] ar = {10, 70, 80, 50, 20, 13, 50};
      boolean testd = false;
	  int res=0;
	  int x = 10;
	  int y = 20;
    
    for(int i = 0; i < ar.length; i++) {
        if(ar[i] == x)
            testd = true;
                    
        if(testd && ar[i] == y)
		{
         System.out.printf( String.valueOf(true));	
         res = 1;
		}
    }
     if (res==0)                             
	   {	 
         System.out.printf( String.valueOf(false));
	    }
		System.out.printf("\n");
 }   
}

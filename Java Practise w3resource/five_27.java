public class five_27 {
    public static void main(String[] args) {
        int[] a = {10,20,10,50,20,13,50,10};
	
      boolean testd = false;
	  int res=0;
	  int x = 10;
	      
	for(int i = 0; i < a.length - 1; i++) {
        if(a[i] == x && a[i+1] == x)
            {
         System.out.printf( String.valueOf(true));	
         res = 1 ;
		}
                  
        if(i <= a.length - 3 && a[i] == x && a[i+2] == x)
           {
         System.out.printf( String.valueOf(true));	
         res = 1 ;
		}
    }
	
	 if (res==0)                             
	   {	 
         System.out.printf( String.valueOf(false));
	    }
		
    }
}

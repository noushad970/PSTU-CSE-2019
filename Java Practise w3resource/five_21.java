public class five_21 {
    public static void main(String[] args) {
        long time = System.nanoTime(); 
	
	int i;
	System.out.println ("first 10 natural numbers are: ");
	for (i=1;i<=10;i++)
	{      
		System.out.println (i);
	}
		long estimatedTime = System.nanoTime() - time;
	System.out.println("Total time to get the first 10 natural numbers: "+estimatedTime);
 
    }
}

public class one_19 {
    public static void main(String[] args) {
        System.out.print("Divisable by 3: ");
        for(int i=0;i<100;i++)
        {
            if(i%3==0)
            System.out.print(i+",");
        }
        System.out.println("\n");
        System.out.print("Divisable by 5: ");
        for(int i=0;i<100;i++)
        {
            if(i%5==0)
            System.out.print(i+",");
        }
        System.out.println("\n");
        System.out.print("Divisable by both 3 and 5: ");
        for(int i=0;i<100;i++)
        {
            if(i%3==0 && i%5==0)
            System.out.print(i+",");
        }
    }
}

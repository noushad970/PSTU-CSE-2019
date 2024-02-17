public class Threading{
    public static void main(String[] args)
    {
        Threading1 t1= new Threading1();
        Threading2 t2= new Threading2();
        t1.start();
        t2.start();
    }
}



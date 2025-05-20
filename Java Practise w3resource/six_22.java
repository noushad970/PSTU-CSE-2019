import java.util.LinkedList;

public class six_22 {
    public static void main(String[] args) {
         LinkedList<Integer> ln= new LinkedList();
         ln.add(20);
         ln.add(40);
         ln.add(60);
         ln.add(80);
        link(ln);
         
         

    }
    static void link(LinkedList ln)
    {
        for(int i=ln.size()-1;i>=0;i--)
         {
            System.out.print(ln.get(i)+" ");
         }
    }
}

public class nine_14 {
    public static void main(String[] args)
    {
        String[] a= {"noushad","nahid","faruk","Basar","fahad","yeasin","binoy"};
        String[] b= {"binoy","nahid","rifat","biswas","basar","rana","noushad"};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i].equals(b[j]))
                System.out.println(b[i]);
            }
        }

    }
}

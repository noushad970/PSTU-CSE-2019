public class nine_15 {
    public static void main(String[] args)
    {
        int[] a= {1,3,4,5,6,7,8,9,0};
        int[] b= {2,3,4,6,7,8,9,0,1};
        System.out.println("Duplicate elements are: ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==(b[j]))
                System.out.print(b[i]+" ");
            }
        }

    }
}

public class one_8 {
    public static void main(String[] args) {
        //int a[]={1,2,3,4};
        int am=0;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                for(int k=1;k<=4;k++)
                {
                    if(i!=j && j!=k && i!=k)
                    {
                       System.out.println(i+""+j+""+k);
                        am++;
                    }
                }
            }

        }
        System.out.println("the total numbers are: "+am);
        
    }
    
}

class varArgs{
    public static void main(String[] args)
    {
        sum s= new sum();
        s.sumation(1,2,3,4,5,6);
    }
}
class sum{
    void sumation(int ... x)
    {
        int sum = 0;
        for(int t:x)
        {
            sum+=t;
        }
        System.out.println("The sum is " + sum);
    }
}
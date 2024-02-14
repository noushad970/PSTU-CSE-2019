class volume{
    public static void main(String[] args)
    {
        value v= new value(12,34,5);
        double vl= v.volumes();
        System.out.println("Volume is : "+vl);
    }
}
class value{
    double height;
    double width1;
    double width2;
    value(double h, double w1,double w2){
        height = h;
        width1 = w1;
        width2 = w2;
    }
    double volumes()
    {
        return height*width1*width2;
    }
}
public class five_1 {
    public static void main(String[] args) {
        String s1="Python";
        String s2="Tutorial";
       // StringBuffer x1=new StringBuffer(s1);
        String s3=s1.concat(s2);
        char[] a=s3.toCharArray();
        for(int i=1;i<a.length;i++)
        System.out.print(a[i]);
    }
}

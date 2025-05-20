
class interface1 {
  public static void main(String[] args) {
    int a=6;
    int b=a++;
    System.out.println(a+" "+b);
    a=6;
    b=++a;
    System.out.println(a+" "+b);
    
    int i=1;
    while(i<10)
    {
        if((i++)%2==0)
        System.out.println(i);
        
    }
}
}

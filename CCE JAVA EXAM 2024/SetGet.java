class SetGet extends x{
    public static void main(String[] args)
    {
        x x1= new x();
        x1.setName("Noushad");
        x1.setAge(21);
        x1.info();
        SetGet sg= new SetGet();
        System.out.println("");
        sg.info();
    }
    
    void info()
    {
    System.out.println("Name: Noushad" );
    System.out.println("Age: 22");
    System.out.println("Id: 121");
    }
}
class x{
    private int age;
    private String name;
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    void info()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " +age);
    }
}
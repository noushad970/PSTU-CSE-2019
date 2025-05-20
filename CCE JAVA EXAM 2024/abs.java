abstract public class abs{
 abstract void sendMsg();
}
 class rohim extends abs{
@Override
void sendMsg()
{
System.out.println("Hello, I am Rohim");
}

}
 class Karim extends abs{
@Override
void sendMsg()
{
System.out.println("Hello, I am Karim");
}

}
 class main{
public static void main(String args[])
{
abs msg;
msg= new rohim();
msg.sendMsg();
msg= new Karim();
msg.sendMsg();
}
}
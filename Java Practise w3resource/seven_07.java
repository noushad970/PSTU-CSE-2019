import java.util.Scanner;

public class seven_07 {
 public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    float min,hour,sec,t,Len,VelInms,VelInkmh,VelInMilH;
    System.out.println("Enter time in hour:");
    hour=s.nextFloat();
    System.out.println("Enter time in Min:");
    min=s.nextFloat();
    System.out.println("Enter time in Sec:");
    sec=s.nextFloat();
    System.out.println("Enter Lenght in Meter:");
    Len=s.nextFloat();
    t=(min*60)+(hour*60*60)+sec;
    VelInms=Len/t;
    VelInkmh=(Len/1000)/(t/3600);
    VelInMilH=((Len/1000)/(t/3600))/1.61f;
    System.out.println("Velocity in meter per second: "+VelInms);
    System.out.println("Velocity in kilometer per hour: "+VelInkmh);
    System.out.println("Velocity in mile per hour: "+VelInMilH);
    

 }   
}

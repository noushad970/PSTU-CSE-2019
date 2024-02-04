import java.util.ArrayList;
import java.util.Scanner;
class ArrayLists
{
public static void main(String args[])
{
ArrayList<Integer> a= new ArrayList<Integer>();
Scanner s= new Scanner(System.in);
for(int i=0;i<4;i++)
{
int x;
x=s.nextInt();
a.add(x);
}

System.out.println(a);
for(int d:a)
System.out.println(d);

}
}
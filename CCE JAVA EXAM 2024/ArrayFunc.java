import java.util.Arrays;
import java.util.Scanner;
class ArrayFunc
{
   public static void main(String args[])
{
	int a[]= new int[10];
	Scanner s= new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
	a[i]=s.nextInt();
	}
	printArr(a);

}
static void printArr(int a[])
{
	for(int i=0;i<a.length;i++)
	{
	System.out.println(a[i]);
	}
}
}
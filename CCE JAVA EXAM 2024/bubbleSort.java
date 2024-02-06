import java.util.Scanner;
import java.util.Arrays;
public class bubbleSort
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
System.out.println("Enter array size: ");
int n=s.nextInt();
int a[]=new int[n];
//int[] a= new int[n];
System.out.println("Enter arrays value: ");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
} 
bubblesort(a,n);
}
static void bubblesort(int a[],int n)
{
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-1-i;j++)
{
int temp=0;
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}

}
}
for(int i=0;i<n;i++)
{System.out.println(a[i]); }
}
}

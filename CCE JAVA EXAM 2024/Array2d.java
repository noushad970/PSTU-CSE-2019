import java.util.Arrays;
class Array2d
{
	public static void main(String args[])
	{
	int a[][]={{1,2,3,4,5},{4,5,6,7,7},{5,3,2,1,6}};
	//int b[][]=new int[5][3];
	printArr(a);
	}
	static void printArr(int a[][])
	{
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<5;j++)
		{
		System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println();
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<3;j++)
		{
		System.out.print(a[j][i]+" ");
		}
		System.out.println();
	}
	}
}
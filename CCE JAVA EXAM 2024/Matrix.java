import java.util.Arrays;
class Matrix
{
	public static void main(String args[])
	{
	int a[][]={{1,2,3},{4,5,6},{5,3,2}};
	int b[][]={{2,2,2},{3,3,3},{5,5,5}};
	int ans[][]=new int[3][3];
	Matrix(a,b,ans);
	
	}
	static void Matrix(int a[][],int b[][],int c[][])
	{	
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	{
	c[i][j]=0;
	for(int k=0;k<3;k++)
	{
	c[i][j]+=a[i][k]*b[k][j];
	}
	}
	}
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	{
	System.out.print(c[i][j]+" ");
	
	}
	System.out.println();
	}
	
	}
}
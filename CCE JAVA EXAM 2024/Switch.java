import java.util.Scanner;
class Switch{
public static void main(String[] args)
{
	int num;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number: ");
	num=s.nextInt();
	switch(num)
	{
		case 1:
		System.out.println("The number is 1");
		break;
		case 2:
		System.out.println("The number is 2");
		break;
		case 3:
		System.out.println("The number is 3");
		break;
		default:
		System.out.println("The number is above 3");
	}	
}
}
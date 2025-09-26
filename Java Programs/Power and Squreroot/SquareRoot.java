import java.util.Scanner;
class SquareRoot
{
	public static void main(String[] args)
	{
	Scanner ab = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = ab.nextInt();
	boolean flag =false;
	for (int i =1; i<=num ; i++ )
	{
		if (i*i==num)
		{
			flag=true;
			System.out.println("Square root is : "+i);
			break;
		}
		if (i*i>num)
		{
			break;
		}
	}
	if(!flag)
		System.out.println(num+" it have no perfect square root");
	}
}
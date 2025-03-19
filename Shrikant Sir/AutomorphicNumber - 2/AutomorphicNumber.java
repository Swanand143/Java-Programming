import java.util.Scanner;
class AutomorphicNumber 2
{
	public static void main(String[] args) 
	{
		
		System.out.print("Enter num : ");
		int num = new Scanner(System.in).nextInt();

		int div = 1;
		for (int i = num;i>0 ;i/=10 )
		{
			div *=10;
		}
		
	}
}

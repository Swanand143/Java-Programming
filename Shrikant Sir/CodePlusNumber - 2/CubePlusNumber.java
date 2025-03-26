import java.util.Scanner;
class CubePlusNumber2 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter range :");
		int range = new Scanner(System.in).nextInt();
		for (int i = 2;i<=range ;i++ )
		{
			int pow = 1;
			
			System.out.print((pow+i) + " ");
		}
	}
}
import java.util.Scanner;
class CubePlusNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter range :");
		int range = new Scanner(System.in).nextInt();
		for (int i = 2;i<=range ;i++ )
		{
			int pow = 1;
			for (int j = 1;j<=3 ;j++ )
			{
				pow *= i;
			}
			System.out.print((pow+i) + " ");
		}
	}
}
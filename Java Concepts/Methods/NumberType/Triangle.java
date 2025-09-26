import java.util.Scanner;
class Triangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter num : ");
	    int num = sc.nextInt();
		triangle(num);
	}
	public static void triangle(int num)
	{
		int a = 1;
		for (int i=1; i<=num; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
	}
}
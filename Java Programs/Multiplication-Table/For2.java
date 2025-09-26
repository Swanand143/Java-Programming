import java.util.Scanner;
class For2
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.print("Enter a Range : ");
		int range = sc.nextInt();

		for (int i=1; i<=range; i++)
		{
			System.out.println(num+"X"+i+"="+(num*i));
		}

	}
}
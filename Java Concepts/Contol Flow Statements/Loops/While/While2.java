import java.util.Scanner;
class While2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int str = 1;
		while (str<=num)
		{
			System.out.print(" | "+str+" |");
			str++;
		}
	}
}
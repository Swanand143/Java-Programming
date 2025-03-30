import java.util.Scanner;
class BuzzNumber2
{
	public static void main(String[] args) 
	{
		
		System.out.print("Enter Number :");
		int num = new Scanner(System.in).nextInt();
		if (num%7==0||num%10==7)
		{
			System.out.print(num + " is a Buzz Number ");
		}
		else 
				System.out.print(num + " is not a Buzz Number ");
		System.out.print(num + " is not a Buzz Number ");

		
	}
}

import java.util.Scanner;
class Return3 //Check Number is Palindromic Prime or not
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int ip = sc.nextInt();
		int rev = reverse(ip);

		if (ip==rev && isPrime(ip)) 
		{
			System.out.println("It is a palindromic prime number !");			
		}
		else
		{
			System.out.println("It is not a palindromic prime number !");
		}	
	}
	public static int reverse(int num)
	{
		int rev = 0;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev;
	}
	public static boolean isPrime(int num)
	{
		int den = 2;
		while(den<num)
		{
			if (num%den==0) 
			{
				break;
			}
			den++;
		}
		return num==den;
	}
}
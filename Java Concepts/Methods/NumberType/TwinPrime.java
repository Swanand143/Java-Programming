import java.util.Scanner;
class TwinPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first prime number :");
		int num1 = sc.nextInt();
		System.out.print("Enter Second prime Number : ");
		int num2 = sc.nextInt();
		if (isTwin(num1 ,num2))
		{
			System.out.print("Numbers are Twin primes ");
			return;
		}
		System.out.print("Numbers are not Twin primes ");
	}
	public static boolean isTwin(int num1 ,int num2)
	{
		if (isPrime(num1)&&isPrime(num2))
		{
			if (num2 -num1 >=2)
			{
				return true;
			}
			return false;
		}
		return false;
	}
	public static boolean isPrime(int num )
	{
		for (int i = 2;i<num ;i++ )
		{
			if (num%i == 0)
			{
				return num == i ? true : false;
			}
			
		}
		return true;
	}
}
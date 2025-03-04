import java.util.Scanner;
class RecPrime
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println(isPrime(num,2));
	}
	public static boolean isPrime(int num, int den)
	{
		if (num==den) 
		{
			return true;
		}
		else if (num%den==0)
		{
			return false;
		}
		return isPrime(num,++den);
	}
}
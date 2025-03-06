//Hint = The number which is divisible by 2,3,5 prime number i.e ugly number
import java.util.Scanner;
class Ugly// to check whether entered number is ugly or not
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number : ");
	    int num = sc.nextInt();
		System.out.println(isUgly(num));
	}
	public static boolean isUgly(int num)
	{ 
		while (num!=1)
		{
			if (num%2==0)
			{
				num/=2;
			}
			else if (num%3==0)
			{
				num/=3;
			}
			else if (num%5==0)
			{
				num/=5;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	
}
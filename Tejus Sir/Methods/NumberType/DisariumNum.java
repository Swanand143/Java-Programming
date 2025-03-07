//1234---> 1^1+2^2+3^3+4^4=original num then 1234 is Disarium number
import java.util.Scanner;
class DisariumNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		System.out.print(isDisarium(num)?num+" is disarium ":num+" is not disarium");
	}
	public static boolean isDisarium(int num)
	{
		int dup = num ;
		int sum = 0;
		while (num!=0)
		{
			int ct = count(num);
			sum += power(num%10 , ct);
			num/=10;
		}
		return dup == sum;
	}
	public static int count(int num)
	{
		int ct = 0;
		while (num!=0)
		{
			ct++;
			num/=10;
		}
		return ct;
	}
	public static int power(int num, int ct )
	{
		int pow = 1;
		for (int i = ct;i>=1 ;i-- )
		{
			pow *= num;
		}
		return pow;
	}
}

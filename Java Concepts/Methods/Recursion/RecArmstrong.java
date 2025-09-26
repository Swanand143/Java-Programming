import java.util.Scanner;
class RecArmstrong //recursion of to check number is armstrong or not
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		int temp = num;
		System.out.println(sumOfDigit(num,temp,0));
	}
	public static boolean sumOfDigit(int num, int temp, int sum)
	{
		if (temp==0) 
		{
			return num == sum;
		}
		else
		{
			int ct = count(num,0);
			int pow = power(temp%10,ct);
			sum = sum + pow;
			return sumOfDigit(num,temp/10,sum);
		}
	}
	public static int count(int num, int ct)
	{
		return num == 0 ? ct : count(num/10,++ct);
	}
	public static int power(int base, int raise)
	{
		return raise==0 ? 1: base*power(base,raise-1);
	}
}
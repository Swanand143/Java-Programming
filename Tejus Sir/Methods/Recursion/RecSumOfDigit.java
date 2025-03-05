import java.util.Scanner;
class RecSumOfDigit
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println(sumOfDigit(num,0));
	}
	public static int sumOfDigit(int num, int sum)
	{
		if (num==0) 
		{
			return sum;
		}
		//return sumOfDigit(num/10,sum+=(num%10));
		return num==0 ? sum : sumOfDigit(num/10,sum+=(num%10));
	}
}
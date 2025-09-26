import java.util.Scanner;
class RecPalindrome //recursion of to check given number is palindrome or not
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		int temp = num;
		System.out.println(reverse(num,temp,0));
	}
	public static boolean reverse(int num, int temp, int rev)
	{
		if (temp==0) 
		{
			return num == rev;
		}
		else
		{
			rev = rev*10+(temp%10);
			return reverse(num,temp/10,rev);
		}
	}
}
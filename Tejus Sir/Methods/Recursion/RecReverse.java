import java.util.Scanner;
class RecReverse//recursion of taking a number and reverse it
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		reverse(num,0);
	}
	public static void reverse(int num, int rev)
	{
		if (num!=0) 
		{
			rev = rev*10+(num%10);
			reverse(num/10,rev);
		}
		else if (num==0) 
		{
			System.out.println(rev);
		}
		return;
	}
}
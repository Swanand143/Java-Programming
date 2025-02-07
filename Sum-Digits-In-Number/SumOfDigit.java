import java.util.Scanner;
class SumOfDigit
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number between 0 to 1000: ");
		int num = new Scanner(System.in).nextInt();
		int dup = num>0?num:0;
		num = dup<1000?dup:0;
		int sum = num%10;
		num = num/10;
		sum = sum + (num%10);
		num = num/10;
		sum = sum + (num%10);
		System.out.println("The sum of all digits is: " + sum);
	}
}
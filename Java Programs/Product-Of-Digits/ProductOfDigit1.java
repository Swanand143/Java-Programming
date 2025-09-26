import java.util.Scanner;
class ProductOfDigit1
{
	public static void main(String[] args)
	{
		System.out.print("Enter a Number : ");
		int  num = new Scanner(System.in).nextInt();
		int pro = 1;
		while (num>0)
		{
			int rem = num%10;
			pro *= rem;
			num/=10;

		}
		System.out.println("Product of all digits in number : " + pro);
	}
}

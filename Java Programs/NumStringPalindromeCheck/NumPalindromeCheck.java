import java.util.Scanner;
class NumPalindromeCheck
{
	public static void main(String[] args)
	{
		Scanner ab = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = ab.nextInt();
		int dup = num;
		int rem = 0;
		int rev = 0;
		while (num>0)
		{
			rem = num%10;
			rev = (rev*10)+rem;
			num/=10;
		}
		System.out.println("Reverse No : "+rev);
		if (dup==rev)
		{
			System.out.println(dup+" is a palindrome");
		}
	    else
		{
			System.out.println(dup+" is not a palindrome");
		}
	}
}
import java.util.Scanner;
class CheckDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a Digit:");
		char digit = sc.next().charAt(0);
		String ans = (digit>='0' && digit<='9')?(digit+" it is a Digit"):(digit+" it is not a Digit");
		System.out.println(ans);
	}
}
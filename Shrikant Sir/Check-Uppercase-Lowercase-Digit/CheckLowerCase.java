import java.util.Scanner;
class CheckLowerCase
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a character: ");
	char ch = sc.next().charAt(0);
	String charValue = (ch>='a'&&ch<='z')?(ch+" is a LowerCase Alphabet"):(ch+" is not a LowerCase Alphabet");
	System.out.println(charValue);
	}
}




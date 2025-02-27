import java.util.Scanner;
class CheckUpperCase
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a character: ");
	char ch = sc.next().charAt(0);

	String charValue = (ch>='A'&&ch<='Z')?(ch+" is a UpperCase Alphabet"):(ch+" is not a UpperCase Alphabet");
	System.out.println(charValue);
	}
}




import java.util.Scanner;
class CheckCharacter2
{
	public static void main(String[] args)
	{
		System.out.print("Enter a character: ");
		char ch = new Scanner(System.in).next().charAt(0);

		String ans = (ch>='A' && ch<='Z'||ch>='a' && ch<='z')?((ch>='A' && ch<='Z')?(ch+" is a UpperCase Alphabet"):(ch+" is a LowerCase Alphabet")):((ch>='0'&& ch<='9')?(ch+" it is a digit"):(ch+" it is a Special Character"));
		System.out.println(ans);

	}
}
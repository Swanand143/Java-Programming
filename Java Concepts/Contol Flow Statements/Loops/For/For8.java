import java.util.Scanner;
class For8
{
	public static void main(String[] args)
	{
		//Chars From Username
		Scanner ab = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String name = ab.next().toUpperCase();
		int len = name.length();
		for (int i=0; i<len; i++)
		{
			System.out.println((i+1) +". "+name.charAt(i));
		}
	}
}
import java.util.Scanner;
class ReverseString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.next().toUpperCase();
		int len = str.length();
		String revString = "";
		for (int i=0; i<len ; i++ )
		{
			char ch = str.charAt(i);
			revString = ch + revString;
		}
		

	}
}

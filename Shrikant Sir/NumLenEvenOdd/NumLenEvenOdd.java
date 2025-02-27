import java.util.Scanner;
class NumLenEvenOdd
{
	public static void main(String[] args)
	{
		Scanner ab = new Scanner(System.in);
		System.out.print("\nEnter a number : ");
		String num = ab.next();
		int len = num.length();
		System.out.println("\nLength of the number : "+len);
		System.out.print("\nModified Number : ");
		for (int i = 0; i<len; i++ )
		{
			if (len%2==0)
			{
				char ch =num.charAt(i);
				if (ch%2 == 0)
				{
					System.out.print(ch-'0');
				}
				else
				{
					System.out.print(((ch+=1)-'0'));
				}
			}
			else
			{
				char ch =num.charAt(i);
				if (ch%2 == 0)
				{
					System.out.print(((ch+=1)-'0'));
				}
				else
				{
					System.out.print(ch-'0');
				}
			}
		}	
	}
}
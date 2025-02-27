import java.util.Scanner;
class BouncyNumber 
{
	// bouncy number is number which digits are continiously
	// increaseor decrease or remains same from left to right
	public static void main(String[] args) 
	{
		System.out.print("Enter a number :");
		int num = new Scanner(System.in).nextInt();  // 112235;
		int rem1 = num%10;
		boolean flaginc = true;
		boolean flagdec = true;

		for (int i=num ;i>0 ;i/=10 )
		{
			int rem = i%10;
			if (!(rem1>=rem))
			{
				flaginc = false;
				break;
			}
			rem1 = rem;
		}
		
		for (int i=num ;i>0 ;i/=10 )
		{
			int rem = i%10;
			if (!(rem1<=rem))
			{
				flagdec = false;
				break;
			}
			rem1 = rem;
		}
		System.out.print(flaginc && flagdec ?num+ " is a not a Bouncy number ": num + " is a Bouncy Number ");
	}
}
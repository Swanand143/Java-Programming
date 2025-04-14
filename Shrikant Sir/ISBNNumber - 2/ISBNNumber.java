import java.util.Scanner;
class ISBNNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter An ISBN number : ");
		long num = new Scanner(System.in).nextLong();
		int sum = 0;
		for (long i = num, j = 1 ;i>0 ;i/=10 , j++ )
		{
			long rem = i%10;
			sum += (rem*j);
		}
		if (sum%11==0)
		{
			System.out.print(num +" is a valid ISBN Number ");
		}
		else
			System.out.print(num+ " is not a valid ISBN Number");
	}
}
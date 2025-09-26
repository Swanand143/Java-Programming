import java.util.Scanner;
class OddSum
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		int sum = 0;
		while (num>0)
		{
			int rem = num%10;
			if(rem%2==1)
			{
				sum = sum + rem;
			}
			num/=10;
		}
       System.out.println("Sum of odd digits : "+sum);
	}
}
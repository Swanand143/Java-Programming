import java.util.Scanner;
class SumOfDigit3
{
	public static void main(String[] args)
	{
		System.out.print("Enter a Number : ");
		int  num = new Scanner(System.in).nextInt();
		int dup = num;
		int sum = 0;
		int sum2 = 0;
		int evenSum = 0;
		while (num>0)
		{
			int rem = num%10;
			sum+= rem;
			num/=10;

		}
		System.out.println("Sum of All digits: " + sum);
		System.out.println("Original number: " + dup);

		while (dup>0)
		{
			int rem2 = dup%10;
			if (dup%2==0)
			{
              
			  sum2+=rem2;
			  
			}
			dup/=10;
		}
           System.out.println("Sum of even digits: " + sum2);
		
	}
}
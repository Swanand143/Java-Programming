import java.util.Scanner;
class MinMaxDigitNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number : ");
		int num = sc.nextInt();
		int max = 0;
		int min = 9;
		for (int i=num; i>0 ;i/=10 )
		{
			int digit = i%10;
			if (max<digit) 
			{
				max = digit;
			}
			else if (min>digit)
			{
				min = digit;
			}
		}
		System.out.println("\nLargest Digit From "+num+" is "+max);
		System.out.println("\nSmallest Digit From "+num+" is "+min);
	}
}
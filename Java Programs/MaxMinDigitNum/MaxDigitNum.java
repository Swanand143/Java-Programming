import java.util.Scanner;
class MaxDigitNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int max = 0;
		for (int i=num; i>0 ;i/=10 )
		{
			int digit = i%10; //fetch last digit
			if (max<digit) //compare the max with last digit
			{
				max = digit;
			}
		}
		System.out.println("Largest Digit From "+num+" is "+max);
	}
}
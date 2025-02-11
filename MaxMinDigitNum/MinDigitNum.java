import java.util.Scanner;
class MinDigitNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int min = 9;
		for (int i=num; i>0 ;i/=10 )
		{
			int digit = i%10;//fetch last digit
			if (min>digit)//compare the min with last digit
			{
				min = digit;
			}
		}
		System.out.println("Largest Digit From "+num+" is "+min);
	}
}
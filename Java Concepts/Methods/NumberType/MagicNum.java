import java.util.Scanner;
class MagicNum// eg. 55---> 5+5=10--> 1+0=1 last sum is 1 then it is magic number
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number : ");
		int num=new Scanner(System.in).nextInt();
		System.out.print(isMagic(num));
		
	}
	public static boolean isMagic(int num)
	{

		while (num>=10)
		{
			num=sumOfDigit(num,0);
		}
		return num==1;
		
	}
	public static int sumOfDigit(int num,int sum)
	{
		if (num==0)
		{
			return sum;
		}
		sum += (num%10);
		return sumOfDigit(num/=10,sum);	
	}
}
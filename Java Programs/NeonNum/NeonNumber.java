import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		/*
			Neon Numbers are such that 
			sum of all digits from the square of original number 
			is equal to original number.
		*/
		System.out.print("Enter Number :");
		int num = new Scanner(System.in).nextInt();
		int sum = 0;
		for (int i = num*num;i>0 ;i/=10 )
		{
			sum +=i%10;
		}
		System.out.print(sum==num ? 
			num + " is a Neon Number": num +" is not a Neon number");
	}
}
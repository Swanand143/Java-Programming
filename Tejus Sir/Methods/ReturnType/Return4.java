import java.util.Scanner;
class Return4// Range Of Prime Number
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a range : ");
		int range = sc.nextInt();
		for (int start=2; start<=range; start++) 
		{
			if (isPrime(start)) 
			{
				System.out.print(start+" ");
			}
		}
	}
	public static boolean isPrime(int num)
	{
		int den = 2;
		for (; den<num; den++) 
		{
			if (num%den==0) 
			{
				return false;
			}
		}
		return true;
	}
}
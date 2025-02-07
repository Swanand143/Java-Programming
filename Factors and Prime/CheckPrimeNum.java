import java.util.Scanner;
class CheckPrimeNum
{
	public static void main(String[] args)
	{
	Scanner ab = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = ab.nextInt();
	int cnt = 0;
	for (int i=1; i<=num; i++ )
	{
		if (num%i==0)	
		{
			cnt++;
		}
	}
    System.out.print(cnt==2?num+" is prime":num+" is not prime");
	}
}
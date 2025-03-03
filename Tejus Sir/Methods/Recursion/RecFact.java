import java.util.Scanner;
class RecFact
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int ip = sc.nextInt();
		System.out.println("Factorial is : "+fact(ip));
	}
	public static int fact(int num)
	{
		if (num==0) 
		{
			return 1;
		}
		return num*fact(num-1);
	}
}
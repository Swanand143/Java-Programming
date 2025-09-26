// Fibonacci Series 0 1 1 2 3 5 8 13
import java.util.Scanner;
class PrintSeries3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a range : ");
		int range = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1+" "+n2+" ");
		for (int i=2; i<=range; i++)
		{
			int next = n1 + n2;	
			System.out.print(next+" ");
			n1 = n2;
			n2 = next;
		}
	}
}
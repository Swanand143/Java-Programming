import java.util.Scanner;
class RecFibo
{
	public static void main(String[] args) 
	{
		System.out.print("Enter range : ");
		int num = new Scanner(System.in).nextInt();
		fibo(num,0,1);
	}
	public static void fibo(int n, int n1, int n2)
	{
		if (n>0) 
		{
			int n3 = n1+n2;
			System.out.print(n1+" ");
			fibo(--n,n2,n3);
		}
	}
} 
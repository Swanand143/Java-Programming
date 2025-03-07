import java.util.Scanner;
class LazyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a range : ");
	    int num = sc.nextInt();
		int j=1;
		for (int i=1;i<=num;i++ )
		{
			j+=i;
			System.out.print(j+" ");
		}
	}
}

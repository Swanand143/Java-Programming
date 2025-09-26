//for ex. 12---> 3*4(consecutive)
import java.util.Scanner;
class PronicNum// to check whether entered number is Pronic or not
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number : ");
	    int num = sc.nextInt();
		System.out.println(isPronic(num));
	}
	public static boolean isPronic(int num)
	{
		for (int i=1; ; i++)
		{
			if (i*(i+1)==num)
			{
				return true;
			}
			else if (i*(i+1)>num)
			{
				return false;
			}
		}
	}
}
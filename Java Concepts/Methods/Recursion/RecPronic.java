import java.util.Scanner;
class RecPronic// to check whether entered number is Pronic or not
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number : ");
	    int num = sc.nextInt();
		System.out.println(isPronic(num,0));
	}
	public static boolean isPronic(int num,int i)
	{
		if (i*(i+1)==num)
		{
			return true;
		}
		else if (i*(i+1)>num)
		{
			return false;
		}
		return isPronic(num,++i);
	}
}
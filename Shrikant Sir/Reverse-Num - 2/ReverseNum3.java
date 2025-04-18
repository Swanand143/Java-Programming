import java.util.Scanner;
class ReverseNum3
{
	public static void main(String[] args)
	{
		Scanner ab = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = ab.nextInt();
		long rev = 0;
		while (num>0||num<0)
		{
			int rem = num%10;
			rev = (rev*10)+rem;
			num/=10;
		}
		if (rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE)
		{
			System.out.println(0);
		}
		else{
		System.out.println("Reverse No : "+rev);
		}
	}
}
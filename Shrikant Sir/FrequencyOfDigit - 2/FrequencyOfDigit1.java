import java.util.Scanner;
class FrequencyOfDigit1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number : ");
		long num = sc.nextLong();
		int digit = 0;
		int max = 0;
		for (int i = 0; i<=9 ; i++)
		{
			int cnt = 0;
			for (long j=num; j>0 ;j/=10 )
			{
				long rem = j%10;
				if (i==rem)
				{
					cnt++;
				}
			}
			if (cnt!=0)
			{
				if (max<cnt)
				{
					max = cnt;
					digit = i;
				}
			}
		}
	}
}

//2  6  22  278  65814
// 2^2+2=6
// 2^
// 2      6      22      278       65814
// 2^2+2  2^4+6  2^8+22  2^16+278  2^32+65814
class PrintSeries2
{
	public static void main(String[] args)
	{
		int num1 = 2;
		System.out.print(num1+" ");
		for (int i=2,p=2; i<=5; i++,p*=2)
		{
			int pow = 1;
			for (int j=1; j<=p; j++)
			{
				pow*=2;
			}
			System.out.print(pow+num1+" ");
			num1 += pow;
		}
	}
}
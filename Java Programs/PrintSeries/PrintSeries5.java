//1   3      9         33           153             873
//1!  1!+2!  1!+2!+3!  1!+2!+3!+4!  1!+2!+3!+4!+5!  1!+2!+3!+4!+5!+6!
class PrintSeries5
{
	public static void main(String[] args)
	{
		int num = 7;
		
		for (int i=1; i<=num ;i++)
		{
			int sum = 0;
			for (int j=1; j<=i ;j++)
			{
				int fact=1;
			
			   for (int n=1; n<=j ;n++ )
			   {
				 fact *= n;
			   }
			   sum += fact;
			}
			System.out.print(sum+" ");
		}
	}
}
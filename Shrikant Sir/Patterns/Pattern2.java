class Pattern2
{
   public static void main(String[] args)
	{
		int n = 15;

		for (int i=1; i<=n ;i++)
		{
			for (int j=1; j<=n; j++)
			{
				if (i-1==n/2||j-1==n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
            System.out.println();

		}
	}
}
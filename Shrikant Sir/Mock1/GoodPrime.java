import java.util.Scanner;
class GoodPrime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n<--- Good Prime Number --->\n");
		System.out.print("Enter Starting Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Ending Number : ");
		int num2 = sc.nextInt();
		System.out.println();
		System.out.print("Good Prime Numbers : ");
		int cnt =0;
		for (int i=num1; i<=num2 ;i++)
		{
			boolean flag = true;
			if (i<2)
			{
				flag =false;
			}
			else
			{
				for (int j = 2;j<i ;j++ )
				{
					if (i%j==0)
					{
						flag =false;
						break;
					}

				}
				if(flag)
				{
					boolean flag2 = true;
					for (int m = i; m >0 ; m/=10 )
					{
						int rem = m%10;
						if (rem<2)
						{
							flag2 = false;
							break;
						}
						for (int n =2;n<rem ;n++ )
						{
							if (rem%n==0)
							{
								flag2 =false;
								break;
							}
						}
					}
					if (flag2)
					{
						System.out.print(i+" ");
					    cnt++;
					}
				}
			}
		}
	    System.out.println();
	    System.out.print("Total Good Prime Numbers : "+cnt);
		System.out.println();
	}
}
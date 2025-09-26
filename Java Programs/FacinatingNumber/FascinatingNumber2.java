import java.util.Scanner;
class FascinatingNumber2 
{
	// fascinating number without string
	public static void main(String[] args) 
	{
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		boolean flag = true;
		for (int i = 2;i<=3 ;i++ )       //multiply the num wwith 2 and 3
		{									// and add at the last of original num 
			num = num*1000+(dup*i);			//	to create nine digit number
		}
		for (int i = 1;i<=9;i++ )
		{
			int cnt = 0;						// check number from 1 to 9
			for (int j = num;j>0 ;j/=10 )		// start checking from last digit 
			{
				if ((j%10)==i)					// cnt will increase for every digit 
				{								
					cnt++;
				}
			}
			if (cnt!=1)							// if any digit repeat more than one then loop breaks
			{
				flag = false;
				break;
			}
		}
		if (flag)
		{
			System.out.print(dup + " is a fascinating number");
		}
		else
			System.out.print(dup + " is not a fascinating number");
	}
}
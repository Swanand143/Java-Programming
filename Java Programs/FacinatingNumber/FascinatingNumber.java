import java.util.Scanner;
class FascinatingNumber 
{
	// fascinating number check using string
	public static void main(String[] args) 
	{
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		String numstr = num + ""+num*2+"" +num*3;
		boolean flag=true;
		/*
			fascinating number is the number :-->
			1) multiply  - with 2
			2) multiply - with 3
			3) concatenate original num and other multipications. 
			check every digit repeated only once and number should contain all digits from 1 to 9.
		*/
		for (char i = '1';i<='9' ;i++ )
		{
			int cnt = 0;
			for (int j = 0;j<numstr.length() ;j++ )
			{
				char ch = numstr.charAt(j);
				if (ch==i)
				{
					cnt++;
				}
			}
			if (cnt!=1)
				{
					flag = false;
					break;
				}
		}
		System.out.print(flag?
			"Yes " + num + " is a fascinating number"
			:"No"+ num + " is not a fascinating number");
	}
}
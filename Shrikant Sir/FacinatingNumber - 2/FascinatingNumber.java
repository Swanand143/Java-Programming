import java.util.Scanner;
class FascinatingNumber2 
{
	// fascinating number check using string
	public static void main(String[] args) 
	{
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		String numstr = num + ""+num*2+"" +num*3;
		boolean flag=true;
		
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
		
	}
}
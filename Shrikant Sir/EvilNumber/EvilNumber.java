import java.util.Scanner;
class EvilNumber
{
	// Evil number is number contains even number of 1's in binary
	public static void main(String[] args) 
	{
		System.out.print("Enter number : ");
		int num =  new Scanner(System.in).nextInt();    // 192;
		String bin = Integer.toBinaryString(num);		
		int cnt = 0;

		for (int i = 0;i<bin.length() ;i++ )
		{
			if (bin.charAt(i)=='1')
			{
				cnt++;
			}

		}
		if (cnt%2==0)
		{
			System.out.print(num +" is a Evil number ");
		}
		else
			System.out.print(num +" is not a Evil number ");
	}
}
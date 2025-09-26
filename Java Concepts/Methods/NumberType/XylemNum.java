// for eg- 1234 ---> 2+3=5(Addition of mid) == 1+4=5(Addition of extrem) then 1234 is Xylem
import java.util.Scanner;
class XylemNum// to check whwther entered number is Xylem or not if it not Xylem then the number is Phloem number
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println(isXylem(num));
	}
	public static boolean isXylem(int num)
	{
		int sumExt = num%10;
		int sumMid = 0;
		num/=10;
		
		while (num>9)
		{
			sumMid += (num%10);
			num/=10;
		}
		sumExt += num;
		return sumExt == sumMid;
	}
}
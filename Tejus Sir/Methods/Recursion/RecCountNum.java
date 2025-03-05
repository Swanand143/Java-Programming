import java.util.Scanner;
class RecCountNum
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println(count(num,0));
	}
	public static int count(int num, int ct)
	{
		if (num==0) 
		{
			return ct;
		}
		//return count(num/10,++ct);
		return num == 0 ? ct : count(num/10,++ct);
	}
}
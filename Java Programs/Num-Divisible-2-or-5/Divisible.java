import java. util. Scanner;
class Divisible
{
	public static void main(String [] args)
	{
	System.out.print("Enter a Number: ");
	int num  = new Scanner(System.in).nextInt();
	String ans = ((num%2==0)&&(num%5==0))?("HiTwoHiFive"):((num%2==0)?("HiTwo"):((num%5==0)?("HiFive"):((num%2!=0 && num%5!=0)?("__"):("__"))));
	System.out.println(ans);
	}
}
import java.util.Scanner;
class if5
{
	public static void main(String[] args)
	{
		System.out.print("Enter Annual Income: ");
		double inc = new Scanner(System.in).nextDouble();
		double tax = 0;
		if (inc>600000)
		{
             tax = tax + (inc*5)/100;
		}
		System.out.println("Your Payable Income Tax is Rs. "+tax);
	}
}
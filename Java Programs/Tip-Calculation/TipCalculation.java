import java.util.Scanner;
class TipCalculation
{
	public static void main(String[] args)
	{
		Scanner ab = new Scanner(System.in);
		System.out.print("Enter the bill: ");
		float bill = ab.nextFloat();

		System.out.print("Enter the tiprate:");
		float tiprate = ab.nextFloat();

		float  tipAmount = (tiprate*bill)/100;
		float totalBill = bill + tipAmount;
		System.out.println("Total bill is: "+totalBill);
		System.out.println("Tip added is: "+tipAmount);


	}
}
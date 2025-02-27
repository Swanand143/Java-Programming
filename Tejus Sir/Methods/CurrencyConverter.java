import java.util.Scanner;
class CurrencyConverter
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Currency In Rupee : ");
		double rupee = new Scanner(System.in).nextDouble();
		rupeeToDollar(rupee);
	}
	public static void rupeeToDollar(double rupee) 
	{
		double dollar = rupee/87.15;
		System.out.println("Dollar : "+dollar);
		dollarToEuro(dollar); 
	}
	public static void dollarToEuro(double dollar) 
	{
		double euro = dollar*0.95;
		System.out.println("Euro : "+euro);
		euroToDihrum(euro); 
	}
	public static void euroToDihrum(double euro) 
	{
		double dihrum = euro*3.85;
		System.out.println("Dihrum : "+dihrum); 
	}
}
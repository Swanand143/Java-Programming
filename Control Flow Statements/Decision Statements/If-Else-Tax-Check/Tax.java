import java.util.Scanner;
class Tax
{
	public static void main(String[] args)
	{
		Scanner ab = new Scanner(System.in);
		System.out.print("Enter your salary per annum : ");
		double salary = ab.nextDouble();

		if (salary>=0 && salary<=1200000)
		{
			System.out.println("No Tax ! ");
		}
		else if (salary>1200000 && salary<=1600000)
		{
			System.out.println("Your Chargable Tax Without Savings is Rs : "+salary*0.15);
		}
		else if (salary>1600000 && salary<=2000000)
		{
			System.out.println("Your Chargable Tax Without Savings is Rs : "+salary*0.20);
		}
		else if (salary>2000000 && salary<=2400000)
		{
			System.out.println("Your Chargable Tax Without Savings is Rs : "+salary*0.25);
		}
		else if (salary>2400000)
		{
			System.out.println("Your Chargable Tax Without Savings is Rs : "+salary*0.30);
		}
		else
		{
			System.out.println("Invalid Salary");
		}
	}
}
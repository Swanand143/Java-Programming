import java.util.Scanner;
class LoanCal
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("    LOAN CALCULATOR  ");
		System.out.println();
		System.out.print("Enter the amount : ");
		float amount = sc.nextFloat();
		System.out.print("Enter Rate of Interest : ");
        float roi = sc.nextFloat();
		System.out.print("Enter the tenure (months) : ");
		int months = sc.nextInt();

		// conversion from months to years
		String str = (months/12)+"."+(months%12);
		float con = Float.parseFloat(str);

		System.out.println();
		System.out.println("LOAN CALCULATION");
		System.out.println("Princial Amount : "+amount);
		System.out.println("Rate of Interest : "+roi+"%");
		System.out.println("Tenure : "+months+ " months");

		float intYear = (amount*roi)/100f;
		float totalInter = intYear*con;
		System.out.println("Interest : "+totalInter);
		
		
		
	}
}

import java.util.Scanner;
class if3
{
   public static void main(String[] args)
	{
		System.out.print("Enter Sallary:");
		float sal = new Scanner(System.in).nextFloat();
		if (sal>=10000)
		{
			sal += (sal*15)/100;
		}
		System.out.println("Your total sallary is Rs."+sal);
	}
} 
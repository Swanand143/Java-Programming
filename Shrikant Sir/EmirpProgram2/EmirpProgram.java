import java.util.Scanner;
class EmirpProgram2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n<---- Emirp Program ---->\n");
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int den= 2, den2 = 2;
		int rem = 0, rev = 0;
		if (num<2)
		{
			System.out.println(num+" is not a prime number");
		}
		else
		{
			while(num>0)
			{
				rem = num%10;
				rev = (rev*10)+rem;
				num/=10;
			}
			System.out.println("Reverse Number : "+rev);
			while (den<=dup/2)
			{
				if (dup%den==0)
				{
					break;
				}
				den++;
			}
			while (den2<=rev/2)
			{
				if (rev%den2==0)
				{
					break;
				}
				den2++;
			}
			if (den>dup/2 && den2>rev/2)
			{
				System.out.println(dup+" is a Emirp number");
			}
			else if (den>dup/2)
			{
                System.out.println(dup+" is prime number but not Emirp number");
			}
			else
			{
				System.out.println(dup+" is not a prime number");
			}
			System.out.println(dup+" is not a prime number");
		}
	}
}

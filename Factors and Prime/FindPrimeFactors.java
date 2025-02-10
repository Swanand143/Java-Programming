import java.util.Scanner;
class FindPrimeFactors
{
	public static void main(String[] args)
	{
	Scanner ab = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = ab.nextInt();
	System.out.print("Prime Factors of "+num+" : ");
	int den;
        for (int i = 2; i <= num; i++) 
		{
            if (num % i == 0) 
			{
                den = 2; 
                while (den < i) 
				{ 
                    if (i % den == 0)
					{
                        break;
                    }
                    den++;
                }
                if (den == i) 
				{ 
                    System.out.print(i + " ");
                }
            }
        }
    }
}
import java.util.Scanner;
class SumOfDigit4
{
	public static void main(String[] args)
	{
		System.out.print("Enter a Number : ");
		int  num = new Scanner(System.in).nextInt();
		int dup = num;
		int sum = 0;
		while (num > 0) 
		{ 
            int rem = num % 10; 
            if (rem % 2 == 0) 
			{ 
                sum += rem;
            }
            num /= 10; 
        }

        System.out.println("Sum of even digits: " + sum);
        System.out.println("Original number: " + dup);
    }
}
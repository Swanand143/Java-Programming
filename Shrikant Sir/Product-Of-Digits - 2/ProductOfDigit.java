import java.util.Scanner;
class ProductOfDigit
{
	public static void main(String [] args)
	{
    System.out.print("Enter Four Digit Number: ");
    int num = new Scanner(System.in).nextInt();
	int dup = num;
	int pro = 1;
	
	int rem = num%10;
	pro = pro * rem;
	num = num/10;

    
	rem = num%10;
	pro = pro * rem;
	num = num/10;

    
	rem = num%10;
	pro = pro * rem;
	num = num/10;

    
	rem = num%10;
	pro = pro * rem;
	num = num/10;

	System.out.println("The Product of all digits is: " + pro);
	}
}
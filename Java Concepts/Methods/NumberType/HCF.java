import java.util.Scanner;
class HCF // Finding HCF(Highest Common Factor) of given two numbers
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a num 1 : ");
	    int num1 = sc.nextInt();
	    System.out.print("Enter a num 2 : ");
	    int num2 = sc.nextInt();
	    System.out.println("HCF is : "+hcf(num1,num2));
	}
	public static int hcf(int n1, int n2)
	{
		int small = n1<n2?n1:n2;
		while(true)
		{
			if (n1%small==0 && n2%small==0) 
			{
				return small;
			}
			small--;
		}
	}
} 
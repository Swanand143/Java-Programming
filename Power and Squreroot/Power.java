import java.util.Scanner;
class Power
{
	public static void main(String[] args)
	{
	Scanner ab = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = ab.nextInt();
	System.out.print("Enter the Power : ");
	int pow = ab.nextInt();
	int opt =1;
	for (int i =1;i<=pow ; i++)
	{
		opt*=num;
	}
	System.out.println(num+"^"+pow+"="+opt);
	//System.out.println(num+"^"+pow+"="+(int)(Math.pow(num,pow)));//method2

	}
}
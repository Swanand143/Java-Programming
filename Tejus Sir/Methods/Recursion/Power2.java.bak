import java.util.Scanner;
class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		System.out.print("Enter power : ");
		int pow = sc.nextInt();
		System.out.print(power(num,pow));
	}
	public static int power (int num , int pow)
	{
		// first way 
		/*if (pow==0)
		{
			return 1;
		}
		return num * (power(num , --pow));*/
		// second optimize way
		return pow == 0 ? 1 : num * (power(num , --pow));
	}
}
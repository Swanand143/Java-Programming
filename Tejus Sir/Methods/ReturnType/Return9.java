import java.util.Scanner;
class Return9//Even Odd Check
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		if ((num/2)*2==num) 
		{
			System.out.println("The number is Even");
			return;
		}
		System.out.println("The number is odd");
 	}
}
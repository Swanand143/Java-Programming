import java.util.Scanner;
class EvenOdd2
{
	public static void main(String[] args)
	{
        System.out.print("Enter a num: ");
		int num = new Scanner(System.in).nextInt();
		System.out.println("method1: " + (num%2==0));

		System.out.println("method2: " + (num/2==num/2.0));

		System.out.println("method3: " + ((num/2)*2==num));
	}
}
import java.util.Scanner;
class PinVerification1
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int storedPin = 1234;
		int sec =5000;

		outerLoop:
		for (; ; )
		{
			int attempt = 0;
		do
		{
			System.out.print("\nEnter Your Pin :");
			int pin = sc.nextInt();
			if (pin==storedPin)
			{
			    System.out.println("Phone Unlocked");
				break outerLoop;
			}
			else
			{
				System.out.println("Invalid Pin !");
				attempt++;
				System.out.println(3-attempt+" attempts left");
			}
		}
		while (attempt<3);
		System.out.println();
		System.out.println("Phone is locked wait For "+(sec/1000)+" seconds");
		Thread.sleep(sec);
		sec *=2;
		System.out.println();
		}
	}
}
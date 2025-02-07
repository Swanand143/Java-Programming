import java.util.Scanner;
class PoundsToKg
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number in pounds: ");
		float pd = new Scanner(System.in).nextFloat();
		float kg = (pd*0.454f);
		System.out.println("It is " + kg + " kg");
	}

}
import java.util.Scanner;
class BmiCal
{
	public static void main(String [] args)
	{
		System.out.print("Enter weight in pounds: ");
		float weight = new Scanner(System.in).nextFloat();

		System.out.print("Enter height in inches: ");
		float height = new Scanner(System.in).nextFloat();

		final float onepd = 0.45359237f;
		float weightToKg = weight * onepd;

		final float oneInc = 0.0254f;
		float heightToMeter = height * oneInc;

		float bmi = weightToKg / (heightToMeter * heightToMeter);
		System.out.print("BMI is: "+bmi);


	}
}
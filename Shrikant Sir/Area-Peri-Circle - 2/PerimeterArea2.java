import java.util.Scanner;
class PerimeterArea2
{
  public static void main (String[] args)
	{

		Scanner ab = new Scanner(System.in);
		System.out.print("Enter the radius(cm): ");
		float radius = ab.nextFloat();
		final float pi = 22/7f;
		float area = pi *(radius*radius);
		System.out.println("Area of circle is : "+area+"cm^2") ;

		float Perimeter = 2* pi *radius;
		System.out.println("Perimeter of circle is : "+Perimeter+"cm");


	}
}
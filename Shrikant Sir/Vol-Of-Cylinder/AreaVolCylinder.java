import java.util.Scanner;
class AreaVolCylinder
{
	public static void main (String[] args)
	{
		Scanner yz = new Scanner(System.in);
		System.out.print("Enter radius (cm): ");
		float radius = yz.nextFloat();

		System.out.print("Enter height (cm): ");
		float height = yz.nextFloat();

		float area = 22/7f*radius*radius;
		System.out.println("Area of cylinder is: "+area+"cm^2");

		float volume = area*height;
		System.out.println("Volume of cylinder is: "+volume+"cm^3");



	}
}
import java.util.Scanner;
class PerimeterAreaRect
{
  public static void main (String[] args)
	{

		Scanner ab = new Scanner(System.in);
		System.out.print("Enter the length(cm): ");
		float length = ab.nextFloat();

		System.out.print("Enter the breadth(cm): ");
		float breadth = ab.nextFloat();
		
		float area = length*breadth;
		System.out.println("Area of rectangle is : "+area+"cm^2") ;

		


	}
}

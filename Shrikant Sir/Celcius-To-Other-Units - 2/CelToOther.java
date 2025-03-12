import java.util.Scanner;
class CelToOther2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("<---- Degree Celcious to Other Temp Units ---->");
		System.out.println();
		System.out.print("Enter Temp in Degree Cel : ");
		float degree = sc.nextFloat();
		System.out.println(); 

		System.out.println(" * List of Units * \n");
		System.out.println("  1. Fahrenheit");
		System.out.println("  2. Kelvin");
		System.out.println("  3. Rankin");
		System.out.println("  4. Reaumur");
		System.out.println();
		System.out.print("Enter Option : ");
		int unit = sc.nextInt();

		float conUnit = 0f;
		switch (unit)
		{
		case 1:{
			conUnit = (degree * 9/5f) + 32f;
		    System.out.println(degree+" Cel = "+conUnit+ " F");
			break;
		}
		case 2:{
            conUnit =degree + 273.15f;
		    System.out.println(degree+" Cel = "+conUnit+ " K");
			break;
		}
		case 3:{
			conUnit = (degree * 9/5f) + 491.67f;
		    System.out.println(degree+" Cel = "+conUnit+ " R");
			break;
		}
		case 4:{
			conUnit = degree*0.8F ;
		    System.out.println(degree+" Cel = "+conUnit+ " r");
			break;
		}
		default:{
			System.out.println("Choose Valid Option");
		}
		
		}
			
	}
}
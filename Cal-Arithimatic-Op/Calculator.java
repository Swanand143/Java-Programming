import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
	
		System.out.print("Enter Num1: ");
		float num1 = new Scanner(System.in).nextFloat();

		System.out.print("Enter Num2: ");
		float num2 = new Scanner(System.in).nextFloat();

		System.out.print("Enter Operator: ");
		char op = new Scanner(System.in).next().charAt(0);

		String opt = 
			(op == '+')?(num1 + " + " + num2 + " = " + (num1 + num2)):
			((op == '-')?(num1 + " - " + num2 + " = " + (num1 - num2)):
			((op == '*')?(num1 + " * " + num2 + " = " + (num1 * num2)):
			((op == '/')?(num1 + " / " + num2 + " = " + (num1 / num2)):
			((op == '%')?(num1 + " % " + num2 + " = " + (num1 % num2)):
			("Invalid Operator Use")))));

		//OR float opt = and change the all ternary true and false places only put num1+num2
		//and in the last String output = num1+""+opt+______get the output
		//in the last line in the place of String 0.000000f
		// if (!)
		
		System.out.println(opt);
	}
}
import java.util.*;
class BinaryToDecimal 
{
	public static void main(String[] args) 
	{
		// here we cant take input as a binary number 
		// if we tried an input as int type 
		// number is treated as a decimal number
		// Integer.parseInt() not supports to convert decimal to decimal
		// thats why we are taking input asbg. a string


		System.out.print("Enter a  binary number : " );
		String bin = new Scanner(System.in).next();         //"101010111";
		int num = Integer.parseInt(bin,2);
		System.out.print(num);

	}
}

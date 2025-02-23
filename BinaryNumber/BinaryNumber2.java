import java.util.Scanner;
class BinaryNumber2 
{
	// decimal to binary conversion with in built method
	public static void main(String[] args) 
	{
		System.out.print("Enter number : ");
		int num =  new Scanner(System.in).nextInt();    // 192;
		String bin = Integer.toBinaryString(num);		// here we use the toBinarystring() in built method 
		System.out.print(num + " in binary is : "+bin);
	}
}
import java.util.Scanner;
class BinaryNumber1 
{
	// decimal to binary conversion without in built method
	public static void main(String[] args) 
	{
		System.out.print("Enter number : ");
		int num =  new Scanner(System.in).nextInt();    // 192;
		String bin ="";
		for (int i = num;i>0 ;i/=2 )
		{                                                                                                                                                                                        
			bin = i%2 + bin;
			 
		}
		System.out.print(num + " in binary is : "+bin);
	}
}
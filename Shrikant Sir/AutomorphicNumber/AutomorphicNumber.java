import java.util.Scanner;
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		/*
			Automorphic number is
			a number repeat in the square at the the last
			1)  5 ---> 25 ----> in this 5 is repeating at last
			2)  25--->625 ----> in this 25 is repeating
		*/
		System.out.print("Enter num : ");
		int num = new Scanner(System.in).nextInt();

		int div = 1;
		for (int i = num;i>0 ;i/=10 )
		{
			div *=10;
		}
		System.out.print(num==((num*num)%div)
			?"Yes "+num + " is a Automorphic number"
			:"No "+ num + " is not Automorphic number- ");
	}
}
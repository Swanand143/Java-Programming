import java.util.Scanner;
class PetersonNumber 
{
	public static void main(String[] args) 
	{
		/*
			Sum of factorials of all the digits from the number is exactly same as original number.
			let num = 145
			fact --> 1 -->1
			         4--->24
					 5---> 120
			if we take sum of factors then 120+24+1 == 145  
		*/
		System.out.print("Enter number : ");
		int num = new Scanner(System.in).nextInt(); //145
			int sum = 0;
		for (int i = num;i>0 ;i/=10 )
		{
			int fact = 1;
			for (int j = 1;j<=(i % 10) ;j++ )
				fact *=j;
			sum += fact;
		}
		System.out.print(sum==num?num+" is a Peterson Number":num+" Not a Peterson number");
	}
}
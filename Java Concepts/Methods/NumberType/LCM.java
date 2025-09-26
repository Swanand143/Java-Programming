import java.util.Scanner;
class LCM // Finding LCM(Least Count Multiple) of given two numbers
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a num 1 : ");
	    int num1 = sc.nextInt();
	    System.out.print("Enter a num 2 : ");
	    int num2 = sc.nextInt();
	    System.out.println("LCM is : "+lcm(num1,num2));
	} 
	public static int lcm(int n1,int n2)
	{
		int max = n1>n2?n1:n2;
		int i = 1;
		while(true)
		{
			if ((max*i)%n1==0 && (max*i)%n2==0) 
			{
				return max*i;
			}
			i++;
		}
	}
}
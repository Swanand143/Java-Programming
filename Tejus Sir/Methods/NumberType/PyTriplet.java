import java.util.Scanner;
class PyTriplet //a^2+b^2=c^2 it is triplets i.e 3^2+4^2=5^2--->  9+16=25---> 25=25
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int n1=sc.nextInt();
		System.out.print("Enter num2 : ");
		int n2=sc.nextInt();
		System.out.print("Enter num3 : ");
		int n3=sc.nextInt();
		System.out.println(isTriplet(n1,n2,n3));

	}
	public static boolean isTriplet(int n1,int n2,int n3)
	{
		return (n3*n3)==(n1*n1)+(n2*n2)?true:false;
	}
}

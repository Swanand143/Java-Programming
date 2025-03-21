import java.util.Scanner;
class Prime2{
	public static void main(String[] args) {
		System.out.print("Enter number to check : ");
		int num = new Scanner(System.in).nextInt();
		if (isPrime(num , 2)) {
			System.out.print(num + " is a prime number");
		}
		else 
			System.out.print(num +" is not a prime number");
	}
	public static boolean isPrime(int num , int den )
	{
		//normal method 
		/*if (den == num/2) {
			return true;
		}
		if (num%den == 0) {
			return false;
		}
		return isPrime(num , ++den);*/

	// optimise method 
	 return den == num/2 ? true : (num% den == 0 ? false : isPrime(num , ++den));
	}
}
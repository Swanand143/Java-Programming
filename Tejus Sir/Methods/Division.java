import java.util.Scanner;
class Division {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***WELCOME***");
		System.out.print("Enter Nemurator : ");
		int num1 = sc.nextInt();
		System.out.println();
		System.out.print("Enter Denominator : ");
		int num2 = sc.nextInt();
		division(num1,num2);
	}

	public static void division(int a , int b) {
		System.out.println("Division of "+a +" and "+b+" is : "+(a/b));
	}
}
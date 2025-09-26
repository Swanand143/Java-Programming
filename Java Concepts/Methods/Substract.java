import java.util.Scanner;
class Substract {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***WELCOME***");
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println();
		System.out.print("Enter Second number : ");
		int num2 = sc.nextInt();
		substract(num1,num2);
	}

	public static void substract(int a , int b) {
		System.out.println("Substraction of "+a +" and "+b+" is : "+(a-b));
	}
}
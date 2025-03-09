import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***WELCOME***");
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println();
		System.out.print("Enter Second nnumber : ");
		int num2 = sc.nextInt();
		add(num1,num2);
	}

	public static void add(int a , int b) {
		System.out.println("Addition is "+a +" and "+b+" is : "+(a+b));
	}
}
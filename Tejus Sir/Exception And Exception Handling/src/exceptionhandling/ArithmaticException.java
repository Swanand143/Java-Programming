package exceptionhandling;

import java.util.Scanner;

public class ArithmaticException {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first num : ");
		int num = sc.nextInt();
		
		System.out.print("Enter the second num : ");
		int den = sc.nextInt();
		
		int ans = num/den;
	    System.out.println("Ans : "+ans);
		
		
//		try {
//			
//			int ans = num/den;
//			System.out.println("Ans : "+ans);
//			
//		} 
//		catch (ArithmeticException ref) {
//			
//			System.out.println("Don't divide by zero");
//		}
		
	}

}

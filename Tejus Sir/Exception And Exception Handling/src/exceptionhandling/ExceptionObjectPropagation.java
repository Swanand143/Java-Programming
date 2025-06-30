package exceptionhandling;

public class ExceptionObjectPropagation {
	
	 public static void main(String[] args) {
		
		 try {
			
			division(10,0);
		} 
		catch (ArithmeticException e) {
			
			System.out.println("Don't Divide By Zero");
		}
	}
	public static void division(int a, int b) {
		
		System.out.println(a/b);
	}

}

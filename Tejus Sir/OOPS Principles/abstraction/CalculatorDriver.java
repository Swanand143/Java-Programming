package abstraction;

public class CalculatorDriver {
	
	public static void main(String[] args) {
		
		Calculator c1 = new CalculatorImp(); //Up Casting
		
		System.out.println(c1.add(5, 4));
		System.out.println(c1.sub(10,7));
		System.out.println(c1.mul(12,4));
		System.out.println(c1.div(10, 2));
		
		System.out.println(c1.modulo(20, 2));
		System.out.println(c1.brand);//NS Variable
	}

}

package abstraction;

public class CalculatorImp extends Calculator{
	
	public CalculatorImp() {
		
	}
	
	//Overrides all methods to parent class from child class i.e give new design
	public int add(int num1, int num2) {
		return num1+num2;
	}
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	public float mul(float num1,float num2) {
		return num1*num2;
	}
	public float div(float num1,float num2) {
		return num1/num2;
	}
	
	//Extra features the developer want to give client/architect but if we up cast then this method never access
	public void name() {
		System.out.println("Welcome");
	}
}

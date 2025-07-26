package wrapper;

public class Wrap3 {
	
	public static void main(String[] args) {
		
		Byte b1 = new Byte((byte)100);
	    Integer b2 = new Integer(100);
		System.out.println(b1.equals(b2));//not possible as they are different objects but we get o/p false
	}
}

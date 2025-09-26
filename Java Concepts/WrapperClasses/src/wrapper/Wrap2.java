package wrapper;

public class Wrap2 {
	
	public static void main(String[] args) {
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		System.out.println(i1 == i2);//false> check the obj ref not attributes
		
		System.out.println(i1.equals(i2));//true> check the attributes not obj ref
		
		System.out.println(i1.hashCode());//10
		System.out.println(i2.hashCode());//10
	}

}

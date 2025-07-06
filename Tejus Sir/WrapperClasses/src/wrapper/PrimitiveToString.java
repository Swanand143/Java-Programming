package wrapper;
//Best Example Of Method Overloading
public class PrimitiveToString {
	
	public static void main(String[] args) {
		
		int a = 100 ; //primitive data 
		String s1 = String.valueOf(a);
		System.out.println(s1); //we get String data
		
		boolean b = true ;
		String s2 = String.valueOf(b);
		System.out.println(s2);
		
		Byte c = 14 ; 
		String s3 = String.valueOf(c);
		System.out.println(s3);
		
		Short s = 20 ;
		String s4 = String.valueOf(s);
		System.out.println(s4);
		
		Long d = 500l;
		String s5 = String.valueOf(d);
		System.out.println(s5);
		
		Character e = 'a';
		String s6 = String.valueOf(e);
		System.out.println(s6);
		
		Double f = 120.15;
		String s7 = String.valueOf(f);
		System.out.println(s7);
		
		Float g = 120.15f;
		String s8 = String.valueOf(g);
		System.out.println(s8);
	}

}

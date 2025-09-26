package wrapper;

public class Parsing {
	
	public static void main(String[] args) {
		
		String a ="2345";//String type data
		int i = Integer.parseInt(a);
		System.out.println(i);//2345 primitive type data
		
		String b = "true";
		boolean val = Boolean.parseBoolean(b);
		System.out.println(val);
		
		String c = "a";
		System.out.println(c.charAt(0));
		
		String d = "14";
		byte b1 = Byte.parseByte(d);
		System.out.println(b1);
		
		String e = "10";
		short s = Short.parseShort(e);
		System.out.println(s);
		
		String f = "5400";
		long l = Long.parseLong(f);
		System.out.println(l);
		
		String g = "11.123";
		double d1 = Double.parseDouble(g);
		System.out.println(d1);
		
		String h = "16.12";
		float f1 = Float.parseFloat(h);
		System.out.println(f1);
	}

}

package wrapper;

public class Unboxing {
	
	public static void main(String[] args) {
		
		Integer i = new Integer(100);
		int ans = i.intValue();//unboxing
		System.out.println(ans);//not support to non-static methods like toString()
		System.out.println(i);//not support to non-static methods like toString()
		
		Character c = new Character('a');
		char ch = c.charValue();//unboxing
		System.out.println(ch);//a
		
		Boolean b = new Boolean(false);
		boolean val = b.booleanValue();//unboxing
		System.out.println(val);//false
		
		Byte a = new Byte((byte)25);
		byte res = a.byteValue();
		System.out.println(res);
		
		Short s = new Short((short)25);
		short sh = s.byteValue();
		System.out.println(sh);
		
		Long l = new Long(250l);
		long lo = l.longValue();
		System.out.println(lo);
		
		Double d = new Double(15.123);
		double dl = d.doubleValue();
		System.out.println(dl);
		
		Float f = new Float(20.12f);
		float fl = f.floatValue();
		System.out.println(fl);
		
	}

}

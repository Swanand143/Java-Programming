class DoubleConversion
{
	public static void main(String[] args)
	{
		double d = 55.5;
		float f = (float) d;
		long l = (long) d;
		int i = (int) d;
		short s = (short) d;
		char c = (char) d;
		byte b = (byte) d;

		System.out.println("Double to float: "+f);
		System.out.println("Double to long: "+l);
		System.out.println("Double to int: "+i);
		System.out.println("Double to short: "+s);
		System.out.println("Double to char: "+c);
		System.out.println("Double to byte: "+b);
	}
}


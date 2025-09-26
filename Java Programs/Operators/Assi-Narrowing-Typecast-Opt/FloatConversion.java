class FloatConversion
{
	public static void main(String[] args)
	{
		float f = 126.3f;
		long l = (long) f;
		int i = (int) f;
		short s = (short) f;
		char c = (char) f;
		byte b = (byte) f;

		System.out.println("Float to long: "+l);
		System.out.println("Float to int: "+i);
		System.out.println("Float to short: "+s);
		System.out.println("Float to char: "+c);
		System.out.println("Float to byte: "+b);
	}

}
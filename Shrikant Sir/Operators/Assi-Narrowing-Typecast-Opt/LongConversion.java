class LongConversion
{
	public static void main(String[] args)
	{
		long l = 400l;
		int i = (int) l;
		short s = (short) l;
		char c = (char) l;
		byte b = (byte) l;

		System.out.println("Long to int: "+i);
		System.out.println("Long to short: "+s);
		System.out.println("Long to char: "+c);
		System.out.println("Long to byte: "+b);
	}

}
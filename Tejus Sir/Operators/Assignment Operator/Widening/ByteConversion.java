class ByteConversion
{
	public static void main(String[] args)
	{
		byte b = 111;
		short s = b;
		//char c = b; byte to char not possible
		int i = b ;
		long l = b;
		float f = b;
		double d = b;

		System.out.println("Byte to short: "+s);
		//System.out.println("Byte to char: "+c);
		System.out.println("Byte to int: "+i);
		System.out.println("Byte to long: "+l);
		System.out.println("Byte to float: "+f);
		System.out.println("Byte to double: "+d);
	}
}
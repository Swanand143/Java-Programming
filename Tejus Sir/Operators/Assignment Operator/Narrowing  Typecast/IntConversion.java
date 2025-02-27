class IntConversion
{
	public static void main(String[] args)
	{
		int i = 300;
		short s = (short) i;
		char c = (char) i;
		byte b = (byte) i;

		System.out.println("Int to short: "+s);
		System.out.println("Int to char: "+c);
		System.out.println("Int to byte: "+b);
	}
}
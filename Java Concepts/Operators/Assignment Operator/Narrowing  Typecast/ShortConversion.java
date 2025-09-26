class ShortConversion
{
	public static void main(String[] args)
	{
		short s = 150;
		char c = (char) s;
		byte b = (byte) s;

		System.out.println("Short to char: "+c);
		System.out.println("Short to byte: "+b);
	}
}
class StatBlock1 
{
	static
	{
		System.out.println("From Static Block 1");
	}
	public static void main(String[] args) 
	{
		System.out.println("From main Method");
	}
	static
	{
		System.out.println("From Static Block 2");
	}
	static
	{
		System.out.println("From Static Block 3");
	}
}

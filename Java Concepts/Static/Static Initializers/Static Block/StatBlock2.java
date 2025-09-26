class StatBlock2 
{
	static
	{
		test();//it call 1st before main method starts
	}
	public static void main(String[] args) 
	{
		System.out.println("From Main method");
	}
	public static void test()
	{
		System.out.println("From test method");
	}
}

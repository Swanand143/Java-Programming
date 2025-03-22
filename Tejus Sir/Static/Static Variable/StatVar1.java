class StatVar1
{
	static int a;
	public static void main(String[] args)
	{
		System.out.println(a);//0
		test();
	}
	public static void test()
	{
		System.out.println(a);//0
	}
}
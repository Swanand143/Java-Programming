class StatBlock3 
{
	static double d;
	
	static
	{
		d = test(100);
		System.out.println("static 1 : "+d);
		d = test(d) + demo((int)d);
		double d = demo((int)test(StatBlock3.d));
		System.out.println("static 2 : "+d);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main 1 : "+d);
		System.out.println("main 2 : "+test(d));
		System.out.println("main 3 : "+(int)demo((int)d));
	}
	
	public static double test(double num)
	{
		return num*num;
	}
	
	public static char demo(int num)
	{
		return(char)num;
	}
}

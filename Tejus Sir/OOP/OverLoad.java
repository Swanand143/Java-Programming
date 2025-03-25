class OverLoad
{
	public static void main(String[] args)
	{
		add(20,10);
		add(19.34,20.70);
		add('a','v');
		add("Swanand ","Gholap");
	}
	
	public static void add(int a,int b)
	{
		System.out.println("Int Add : "+(a+b));
	}
	
	public static void add(double d1,double d2)
	{
		System.out.println("Double Add : "+(d1+d2));
	}
	
	public static void add(char ch1,char ch2)
	{
		System.out.println("Char Add : "+(ch1+ch2));
	}
	
	public static void add(String str1,String str2)
	{
		System.out.println("String Add : "+(str1+str2));
	}
}
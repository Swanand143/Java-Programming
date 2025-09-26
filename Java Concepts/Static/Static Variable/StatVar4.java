class StatVar4 
{
	static String s;
	public static void main(String[] args) 
	{
		System.out.println(s);//null
		demo();//Qspiders
		String s = "Tejus";
		System.out.println(s);//Tejus
		System.out.println(StatVar4.s);//Qspiders
	}
	public static void demo()
	{
		s = "Qspiders";
		System.out.println(s);//Qspiders
	}
}

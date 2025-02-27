class M6
{
	public static void main(String[] args) 
	{
		sum('a',10);//97+10=107
		division(100.0,50.0);//2.0
	}
	public static void sum(int a, int b)
	{
		int res = a+b;
		System.out.println(res);//107
	}
	public static void division(double num, double den)
	{
		double res = num/den;
		System.out.println(res);//2.0
	}
}
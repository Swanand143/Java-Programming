class Increment
{
	public static void main(String[] args)
	{
		int mon = 100;
		System.out.println(++mon); //101
		System.out.println(mon++); //101
		System.out.println(++mon); //103
		System.out.println(mon++); //103
		System.out.println(++mon + mon++);//210
		System.out.println(++mon);//107
	}

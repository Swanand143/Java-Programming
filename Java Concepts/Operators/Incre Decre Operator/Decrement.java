class Decrement
{
	public static void main(String[] args)
	{
		int mon = 200;
		System.out.println(--mon); //199
		System.out.println(mon--); //199
		System.out.println(--mon); //197
		System.out.println(mon--); //197
		System.out.println(--mon + mon--);//390
	}
}

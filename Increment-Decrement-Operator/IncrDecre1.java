class IncrDecre1
{
	public static void main (String [] args)
	{
		int a = 5;
		int b = 7;
		int c = 3;

		a = b++ - --c;
		int d = ++c + b--;
		c = a++ + --b + ++d;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);

		int p = -1;
		int q = 5;
		int r = 17;

		int s = p++ - q-- * r;
		s = s++;
		q = -p++ + r--;

		System.out.println("p="+p);
		System.out.println("q="+q);
		System.out.println("r="+r);
		System.out.println("s="+s);

		int i = 3;
		i = i--;
		System.out.println("i="+i);

		int f = 6;
		f = ++f;
		System.out.println("f="+f);
	
	}
}
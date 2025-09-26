class Modulus
{
	public static void main(String[] args)
	{
		byte opr1 = 60;
	    byte opr2 = 25;
		int op1 = opr1  % opr2;
		System.out.println("op1:"+ op1); // byte % byte = int 

		short opr3 = 400;
	    short opr4 = 115;
		int op2 = opr3 % opr4;
		System.out.println("op2:"+ op2); // short % short = int

		char opr5 = 'A';
	    char opr6 = 'D';
		int op3 = opr5 % opr6;
		System.out.println("op3:"+ op3); // char % char = int

		int opr7 = 4900;
	    int opr8 = 2100;
		int op4 = opr7 % opr8;
		System.out.println("op4:"+ op4); // int % int = int 

		long opr9 = 7540l;
	    long opr10 = 4110l;
		long op5 = opr9 % opr10;
		System.out.println("op5:"+ op5); // long % long = long

		float opr11 = 5.4f;
	    float opr12 = 2.3f;
		float op6 = opr11 % opr12;
		System.out.println("op6:"+ op6); // float % float = float
		
		double opr13 = 5.4;
	    double opr14 = 2.3;
		double op7 = opr13 % opr14;
		System.out.println("op7:"+ op7); // double % double = double

		//String opr15 = "Java";
		//String opr16 = "Program";
		//String op8 = opr15 % opr16;
		//System.out.println(op8); // CTE

		//boolean opr17 = true ;
		//boolean opr18 = false;
		//boolean op9 = opr17 % opr18;
		//System.out.println(op9); // CTE
	}
}
class PopulationCalculation
{
	public static void main(String[] args)
	{
		long CurrPop = 312032486;
		long sec = (365*24*60*60)*5;
		long birth = sec/7;
		long death = sec/13;
		long imm = sec/45;

		long newPop = CurrPop + birth - death + imm;
		System.out.println("Current Population is: "+CurrPop);
		System.out.println("New Population is: "+newPop);
	}
}
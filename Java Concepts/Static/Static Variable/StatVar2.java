class StatVar2 
{
	static double balance ;
	
	public static void main(String[] args) 
	{
		credit(10000);
		debit(100);
	}
	
	public static void credit(double amt)
	{
		if (amt>0)
		{
			balance += amt;
			System.out.println("Amount Credited!");
			System.out.println("Your Current Balance is "+balance);
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}
		 
	public static void debit(double amt)
	{
		if (amt>0 && balance-amt>1000)
		{
			balance -= amt;
			System.out.println("Amount Debited!");
			System.out.println("Your Current Balance is "+balance);
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}	
}

class ACDriver 
{
	public static void main(String[] args) 
	{
		AC a1 = new AC();
		
		a1.brand = "Blue Star";
		a1.price = 15000.0;
		a1.ton = 1;
		a1.minTemp = 10.0;
		a1.maxTemp = 30.0;
		a1.ambTemp = 14.0;
		
		a1.displayDetails();
		System.out.println("-------------");
		a1.miniTemp();
		System.out.println("-------------");
		a1.maxiTemp();
		System.out.println("-------------");
		a1.ambiTemp();
		
	}
}

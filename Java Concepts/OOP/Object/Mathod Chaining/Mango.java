class Mango 
{
	double price ;
	String type ;
	String origin ; 
	
	public Mango printPrice()
	{
		System.out.println("Price : "+price);
		return this;
	}
	public Mango printType()
	{
		System.out.println("Type : "+type);
		return this;
	}
	public Mango printOrigin()
	{
		System.out.println("Origin : "+origin);
		return this;
	}
}

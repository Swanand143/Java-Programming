class Shoe 
{
	String brand = "Reebok";
	double price ;
	int size ;
	String color ;
	String type ;
	
	//Non Static Block
	{
		System.out.println("Non-static block starts");
		if (brand.charAt(0)=='N')
		{
			price = 1000.0d;
		}
		else
		{
			price = 500;
		}
		displayShoe();//Calling Method in non-satatic block
		System.out.println("Non-static block ends");
	}
	
	//No-args Constructor
	Shoe()
	{
		
	}
	
	//Parameterized Constructor
	Shoe(double price,int size,String type,String color)
	{
		System.out.println("Constructor Block Start");
		this.price = price ;
		this.size = size ;
		this.type = type ;
		this.color = color ;
		System.out.println("Constructor Block End");
	}
	
	//Non-static user defined methods
	public void displayShoe()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(size);
		System.out.println(type);
		System.out.println(color);
	}
}

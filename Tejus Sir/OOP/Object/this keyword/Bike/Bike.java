class Bike  
{
	String brand;
	String name;
	double price;
	int cc;
	int mileage;
	
	public void displayBike()
	{
		String name = "Chapri Bike";// Declared Local Variable
		System.out.println("Brand : "+brand);
		System.out.println("Name : "+name);//Print Local Variable(Chapri Bike)
		System.out.println("Name : "+this.name);//Print non-static variable 
		System.out.println(this);//print refrence of the current object was created 
		System.out.println("Price : "+price);
		System.out.println("CC : "+cc);
		System.out.println("Mileage : "+mileage);
	}
}

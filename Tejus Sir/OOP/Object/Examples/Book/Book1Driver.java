class Book1Driver
{
	public static void main(String[] args)
	{
		Book1 b1 = new Book1();
		System.out.println("Book1 :"+b1);
		b1.brand = "Classmate";
		b1.price = 50.0;
		b1.noOfPages = 100;
		b1.type = "A4 Long";
		b1.weight = 100;
		b1.bound = "Soft";
		
		System.out.println("Brand : "+b1.brand);
		System.out.println("Price :"+b1.price);
		System.out.println("No. of Pages :"+b1.noOfPages);
		System.out.println("Type : "+b1.type);
		System.out.println("Weight : "+b1.weight);
		System.out.println("Bound : "+b1.bound);
		
		System.out.println("--------------------");
		
		Book1 b2 = new Book1();
		System.out.println("Book2 :"+b2);
		System.out.println("Brand : "+b2.brand);
		System.out.println("Price :"+b2.price);
		System.out.println("No. of Pages :"+b2.noOfPages);
		System.out.println("Type : "+b2.type);
		System.out.println("Weight : "+b2.weight);
		System.out.println("Bound : "+b2.bound);
		
	}
}
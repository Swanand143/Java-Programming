package collectionTreeSet;

public class Marker implements Comparable<Marker>{
	
	static int markerId = 102;
	static String brand = "DOMS";
	String color ;
	double price ;
	int id ;
	
	{
		this.id = markerId++;
	}
	
	Marker(String color, double price){
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return id+": "+color+" , Price : "+price;
	}
	
	//1st Method attri is price
	@Override
	public int compareTo(Marker obj) {
		if(this.price<obj.price)
		{
			return -1;
		}
		else if (this.price>obj.price) 
		{
			return 1;
		}
		return 0;
	}
	
//	2nd Method attri is price
//	@Override
//	public int compareTo(Marker obj) {
//		return (int)(obj.price-this.price);
//	}
	
	// attri is color
//	public int compareTo(Marker obj) {
//		return this.color.compareTo(obj.color);
//	}
	

}

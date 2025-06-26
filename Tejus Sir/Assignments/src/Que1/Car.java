package Que1;

public class Car {
	
	String model ;
	String color ;
	int speed ;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String model, String color, int speed) {
		
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	public void displayDetails() {
		
		 System.out.println("Model: " + model);
	     System.out.println("Color: " + color);
	     System.out.println("Speed: " + speed + " km/h");
	     System.out.println("-------------------------");
	}
	

}

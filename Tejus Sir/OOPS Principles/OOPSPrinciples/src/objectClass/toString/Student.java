package objectClass.toString;

public class Student {
	
	String name ;
	String college ;
	int roll ;
	String degree ;
	String stream ;
	
	public Student() {
		
	}
	
	public Student(String name, String college,int roll, String degree, String stream) {
		
		this.name = name ;
		this.college = college ;
		this.roll = roll ;
		this.degree = degree ;
		this.stream = stream ;
		
	}
	
	public String toString() {
		
		return "Name: "+name+",College: "+college+",Roll No: "+roll+",Degree: "+degree+",Stream: "+stream;
	}

}

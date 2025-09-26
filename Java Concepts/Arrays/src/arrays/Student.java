package arrays;

public class Student {
	
	String name ;
	int age ;
	int rollNo;
	char gender;
	
	public Student() {
		
	}

	public Student(String name, int age, int rollNo, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		
		return "[name = "+name+",age = "+age+",rollNo = "+rollNo+", gender = "+gender+"]";
		
	}

}

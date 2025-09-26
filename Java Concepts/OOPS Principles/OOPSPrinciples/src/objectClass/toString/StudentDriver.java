package objectClass.toString;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Aditya","SVIT",60,"BE","Comp");
		System.out.println(s1);
		
		Student s2 = new Student("Ram","MET",13,"BE","IT");
		System.out.println(s2.toString());
	}

}

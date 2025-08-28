package objectClass.equals;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Aditya","SVIT",60,"BE","Comp");
		Student s2 = new Student("Aditya","SVIT",60,"BE","Comp");
		System.out.println(s1);
		System.out.println(s2);
		
		//Student s2 = new Student("Ram","MET",13,"BE","IT");
		//System.out.println(s2.toString());
		
		System.out.println(s1==s2);//compare two objects by their references
		System.out.println(s1.equals(s2));//compare two objects by their attributes
	}

}

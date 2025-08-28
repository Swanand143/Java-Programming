package Encapsulation;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student("Swanand", "JAVA FullStack", 40000.0, "Deccan", 8.20, "BE", 82.80, 70.50, 123456789l);
		System.out.println(s1.getName());
		System.out.println(s1.getInstituteName());
		System.out.println(s1.getSscPer());
		System.out.println(s1.getPhno());
		s1.setPhno("Swanand", 123456789l, 987456123l);
		System.out.println(s1.getPhno());
	}

}

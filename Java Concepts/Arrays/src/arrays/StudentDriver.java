package arrays;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		Student [] db = new Student[5];
		System.out.println(db);// print the reference of the array
		
		// Lazy Binding
		db[0] = new Student("Ganesh",21,35,'M');
		db[1] = new Student("Aditya",22,36,'M');
		db[2] = new Student("Sanket",20,37,'M');
		db[3] = new Student("Chaitanya",22,38,'M');
		db[4] = new Student("Harshali",21,39,'F');
		
		for (int i = 0; i < db.length; i++) {
			
			System.out.println(db[i]);
			//System.out.println(db[i].name); when you want to print the specific field	
		}
	}
	

}

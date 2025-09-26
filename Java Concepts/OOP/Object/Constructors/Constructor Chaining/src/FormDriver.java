class FormDriver{
	public static void main(String[] args) {
	
		Form f1 = new Form();
		f1.displayForm();		

		System.out.println("\n-------------------------------------------\n");

		// this constructor calling to that constructor body in blueprint that accepts String, long, char, String
		Form f2 = new Form("Swanand", 8999169526l, 'M', "25/04/2003");
		f2.displayForm();	

		System.out.println("\n-------------------------------------------\n");

		Form f3 = new Form("Ganu", 8999169526l, 'M', "25/04/2003", 4564255184l, "O+", "ugale.ganesh.d@gmail.com");
		f3.displayForm();	
	}
}
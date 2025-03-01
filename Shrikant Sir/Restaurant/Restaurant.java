import java.util.Scanner;
class Restaurant{
	static Scanner sc = new Scanner(System.in); // Gloabally Accessible
	static String userName1, password1, address, userName2, password2, dish1 = "", dish2 = "", dish3 = "", dish4 = "", dish5 = "", dish6 = "";
	static byte age;
	static int totalAmount = 0;

	public static void main(String[] args) {
		System.out.print("\n=======================|| JAVA KA DHABA ||=======================\n");

		for ( ; ; ) {
			System.out.println("\n1. CREATE ACCOUNT");
			System.out.println("2. EXISTING USER");
			System.out.println("3. EXIT");
			System.out.print("\nSelect the Option : ");
			byte opt = sc.nextByte();

			switch (opt){
			case 1:
				{
					createAccount();
					break;
				}

			case 2:
				{
					loginAccount();
					break;
				}
			case 3:
				{
					exitApplication();
					System.out.println("                                        Thank You, Please Come Again!");
				}
			default:System.out.print("                                        INVALID OPTION");break;
			}
		}
	}
	// Methods Definitions
	// Account Creation Method
	public static void createAccount(){
		System.out.println("\n--------|| ACCOUNT CREATION PAGE ||--------");
		System.out.print("\nCreate Username : ");
		userName1 = sc.next();
		System.out.print("Create Password : ");	
		password1 = sc.next();
		System.out.print("Enter Address : ");
		address = sc.next();
		System.out.print("Enter Age : ");
		age = sc.nextByte();
		System.out.println("\n                                     ---+|| ACCOUNT CREATED SUCCESSFULL ||+---");
	}

	// Account Login Method
	public static void loginAccount(){
		if (userName1 == null){
			System.out.println("\n                                 ---+|| CREATE ACCOUNT FIRST :-( !!! ||+---\n");
			return;
		}

		for (int attempts = 3; attempts >= 1 ; attempts--) {
			System.out.println("\n--------|| LOGIN PAGE ||--------");
			System.out.print("\nEnter Username : ");
			userName2 = sc.next();
			System.out.print("Enter Password : ");
			password2 = sc.next();
			if (userName1.equals(userName2) && password1.equals(password2)) {
				System.out.println("\n                                 ---+|| LOGINE SUCCESSFULL :-) ||+---");
				homepage();
				break;
			}
			else{
				System.out.println("\n                                 ---+|| INVALID CRED ||+---");
				System.out.println("Attempts Left : " + (attempts - 1));
			}
		}
		System.out.println("                                 ---+|| Thank You, Never Visit Again! ||+---");
		exitApplication();
	}

	// Exit the Application Method
	public static void exitApplication(){
		System.exit(0);
	}

	// Home Page Method
	public static void homepage(){
		for ( ; ; ) {
			System.out.println("\n--------|| HOME PAGE ||--------\n");
			System.out.println("1. MENU");
			System.out.println("2. ORDERS");
			System.out.println("3. CANCEL ORDERS");
			System.out.println("4. PAYMENT");
			System.out.println("5. Logout");
			System.out.print("\nSelect the Option : ");
			byte opt = sc.nextByte();

			switch (opt){
			case 1:
				{
					menu();
					break;
				}
			case 2:
				{
					displayOrders();
					break;
				}
			case 3:
				{
					cancelOrders();
					break;
				}
			case 4:
				{
					payment();
					break;
				}
			case 5:
				{
					System.out.println("\n--------|| Thank You, Visit Again! ||--------");
					exitApplication();
				}
			}
		}
	}

	// Menu Method
	public static void menu(){
		for ( ; ; ) {
		System.out.println("\n-------------|| MENU ||-------------");
		System.out.println(" ID        DISH NAME        PRICE");
		System.out.println(" 1.        MAHA THALI        120/-");
		System.out.println(" 2.        PURAN POLI        200/-");
		System.out.println(" 3.        MISAL PAAV        100/-");
		System.out.println(" 4.        PALAK PANEER      150/-");
		System.out.println(" 5.        CHAPATI           20/-");
		System.out.println(" 6.        ROTI              35/-");
		System.out.println(" 7.        GO BACK");
		System.out.print("\nEnter DISH ID : ");
		byte id = sc.nextByte();

		
			switch (id){
			case 1:
				{
					System.out.println("\n 1.        MAHA THALI        120/-");
					System.out.println("--> MAHA THALI ADDED IN THE BUCKET");
					dish1 = " 1.        MAHA THALI        120/-";
					totalAmount += 120;
					break;
				}
			case 2:
				{
					System.out.println("\n 2.        PURAN POLI        200/-");
					System.out.println("--> PURAN POLI ADDED IN THE BUCKET");
					dish2 = " 2.        PURAN POLI        200/-";
					totalAmount += 200;
					break;
				}
			case 3:
				{
					System.out.println("\n 3.        MISAL PAAV        100/-");
					System.out.println("--> MISAL PAAV ADDED IN THE BUCKET");
					dish3 = " 3.        MISAL PAAV        100/-";
					totalAmount += 100;
					break;
				}
			case 4:
				{
					System.out.println("\n 4.        PALAK PANEER      150/-");
					System.out.println("--> PALAK PANEER ADDED IN THE BUCKET");
					dish4 = " 4.        PALAK PANEER        150/-";
					totalAmount += 150;
					break;
				}
			case 5:
				{
					System.out.println("\n 5.        CHAPATI           20/-");
					System.out.println("--> CHAPATI ADDED IN THE BUCKET");
					dish5 = " 5.        CHAPATI           20/-";
					totalAmount += 20;
					break;
				}
			case 6:
				{
					System.out.println("\n 6.        ROTI              35/-");
					System.out.println("--> ROTI ADDED IN THE BUCKET");
					dish6 = " 6.        ROTI              35/-";
					totalAmount += 35;
					break;
				}
			case 7: return;
			default: System.out.println("\n                                 ---+|| INVALID ID, PLEASE ENTER AGAIN! ||+---"); return;
			}
		}
	}

	// For Display Orders Method 
	public static void displayOrders(){
		if ((dish1 == "") && (dish2 == "") && (dish3 == "") && (dish4 == "") && (dish5 == "") && (dish6 == "")){
			System.out.println("\n                                 ---+|| FIRST ADD THE ORDERS! :-( ||+---");
			return;
		}
		System.out.println("\n---------------|| ORDERS ||---------------\n");
		if (dish1 == " 1.        MAHA THALI        120/-")
			System.out.println(dish1);
		if (dish2 == " 2.        PURAN POLI        200/-")
			System.out.println(dish2);
		if (dish3 == " 3.        MISAL PAAV        100/-")
			System.out.println(dish3);
		if (dish4 == " 4.        PALAK PANEER        150/-")
			System.out.println(dish4);
		if (dish5 == " 5.        CHAPATI        20/-")
			System.out.println(dish5);
		if (dish6 == " 6.        ROTI              35/-")
			System.out.println(dish6);
		System.out.println("\n----> TOTAL BILL = " + totalAmount + "/-");	
		if (totalAmount >= 600) {
			totalAmount-=25;
			System.out.println("\n---+|| CONGRADULATIONS YOU GOT RS 25 DISCOUNT! ||+---");
		}
		System.out.println("\n----> TOTAL BILL PAYABLE = " + totalAmount + "/-");	
	}

	// For Cancal Orders Method
	public static void cancelOrders(){
		if ((dish1 == "") && (dish2 == "") && (dish3 == "") && (dish4 == "") && (dish5 == "") && (dish6 == "")){
			System.out.println("\n                                 ---+|| NO ORDERS, BUCKET IS EMPTY! :-( ||+---");
			return;
		}	
		System.out.println("\n--------|| CANCEL ORDERS ||--------\n");
		System.out.print("DO YOU WANT TO CANCEL ORDERS?(y/n) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		if (ch == 'Y') {
			dish1 = "";dish2 = ""; dish3 = ""; dish4 = ""; dish5 = ""; dish6 = "";
			System.out.println("\n                                 ---+|| ORDERS CANCEL SUCCESSFULL ||+---");
		}
		else if (ch == 'N'){
			System.out.println("\n                                 ---+|| ORDERS ARE SAFE ||+---");
			return;
		}
	}

	// For Payment Method
	public static void payment(){
		if ((dish1 == "") && (dish2 == "") && (dish3 == "") && (dish4 == "") && (dish5 == "") && (dish6 == "")){
			System.out.println("\n                                 ---+|| NO ORDERS, BUCKET IS EMPTY! :-( ||+---");
			return;
		}	
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");		
		System.out.println("\n--------|| PAYMENT RECIEFT ||--------\n");

		System.out.println("Name : " + userName1);
		System.out.println("Address : " + address);
		System.out.print("Age : " + age);
		System.out.println();
		displayOrders();
		System.out.print("\nUPI : javakadhaba@ybl\n");
		System.out.println("\n              ---+|| THANK YOU, COME AGAIN! ||+---");
		System.out.println("\n----------+|| PAYMENT RECIEFT PRINTING ||+---------- \n");
		System.out.println();
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		exitApplication();
	}
}
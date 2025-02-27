import java.util.Scanner;
class Restaurant
{
	static String name ; // null
	static long contact ; // 0
	static String address; // null

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for (; ; ) 
		{
			System.out.println();
			System.out.println(" ****** AURA KA DHABA ****** ");
			System.out.println();
			System.out.println("1. Creat Account");
			System.out.println("2. Existing User");
			System.out.println();
			System.out.print("Enter an option : ");
			int opt = sc.nextInt();
			System.out.println();
			switch(opt)
			{
			    case 1 : creatAccount(sc); break;
			    case 2 : login(sc); break;
			    default : System.out.println("Invalid Input !!!");
			}
		}
		
	}
	public static void creatAccount(Scanner sc)
	{
		System.out.println(" *** Registration *** ");
		System.out.println();
		System.out.print("Name : ");
		name = sc.next();
		System.out.print("Phone No : ");
		contact = sc.nextLong();
		System.out.print("Address : ");
		sc.nextLine();
		address = sc.next();
		System.out.println();
		System.out.println("Account Created Successfully");
	}
	public static void login(Scanner sc)
	{
		if (name == null) 
		{
			System.out.println("Create Your Account First");
			return;// calling method(main)
		}
		System.out.println(" *** Login *** ");
		System.out.println();

		for (int attempt = 3; attempt>=1; attempt--) 
		{
			System.out.print("Username : ");
			String username = sc.next();
			System.out.print("Password : ");
			long phone = sc.nextLong();
			System.out.println();
			if (name.equals(username) && contact == phone) 
			{
			    homePage(sc);	
			}
			else
			{
				System.out.println("Invaild Credential !");
				System.out.println("Attempt Left : "+(attempt-1));
				System.out.println();
 
			}
		}
		System.out.println("Thank You Never Come Again !");
		System.exit(0);// terminate the execution

	}
	public static void homePage(Scanner sc)
	{
		System.out.println(" **** Home Page **** ");
		System.out.println();
		System.out.println("1. Menu");
		System.out.println("2. Order");
		System.out.println("3. Table booking");
		System.out.println("4. Logout");
		System.out.println();
		System.out.print("Enter an option : ");
		int opt = sc.nextInt();

		/*switch(opt)
		{
		   case 1 : menu(); break;
		}*/

	}
}
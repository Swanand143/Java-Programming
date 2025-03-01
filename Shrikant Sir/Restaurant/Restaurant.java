import java.util.Scanner;
class Restaurant
{
	static String name ; // null
	static long contact ; // 0
	static String address; // null
	static ArrayList<String> basket = new ArrayList<>();

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
		for (; ; ) 
		{
		    System.out.println();
		    System.out.println(" **** Home Page **** ");
		    System.out.println();
		    System.out.println("1. Menu");
		    System.out.println("2. Order");
		    System.out.println("3. Table booking");
		    System.out.println("4. Logout");
		    System.out.println();
		    System.out.print("Enter an option : ");
		    int opt = sc.nextInt();

		    switch(opt)
		    {
		        case 1 : menu(sc); break;
		        case 2 : order(sc); break;
		        case 3 : tableBooking(); break;
		        case 4 : System.out.println("Thank You & Visit Again");
		        	     System.exit(0); break;
		        default : System.out.println("Invalid Input");    	
		    }
		}
	}
	public static void menu(Scanner sc)
	{
		for (; ; ) 
		{
			System.out.println();
			System.out.println(" *** Menu *** ");
			System.out.println("101 : Paneer_Buttur = 250/-");
			System.out.println("102 : Special_Shevbhaji = 150/-");
			System.out.println("103 : Veg_Kolhapuri = 180/-");
			System.out.println("104 : Rice_Daal = 100/-");
			System.out.println("105 : Roti = 15/-");
			System.out.println("106 : Exit Menu");
			System.out.println();
			System.out.print("Enter an Food Id : ");
			int id = sc.nextInt();
			switch(id)
			{
			    case 101:{
			    	basket.add("101 : Paneer_Buttur = 250");
			    	System.out.println("Paneer Buttur added inside basket");
			    	break;
			    }
		    	case 102:{
		    		basket.add("102 : Special_Shevbhaji = 150");
		    		System.out.println("Special Shevbhaji added inside basket");
		    		break;
		    	}
		        case 103:{
		        	basket.add("103 : Veg_Kolhapuri = 180");
		        	System.out.println("Veg Kolhapuri added inside basket");
		        	break;
		        }
		        case 104:{
		        	basket.add("104 : Rice_Daal = 100");
		        	System.out.println("Rice Daal added inside basket");
		        	break;
		        }
		        case 105:{
		        	basket.add("105 : Roti = 15");
		        	System.out.println("Roti added inside basket");
		        	break;
		        }
		        case 106:{
		        	return;
		        }
		        default:{
		        	System.out.println("Inavlid Food Id");
		        	break;
		        }
			}
		}
	}
	public static void order(Scanner sc)
	{
		System.out.println();
		System.out.println(" *** Orders *** ");
		System.out.println();
		if (basket.size()==0) 
		{
			System.out.println("Basket is empty add Food Items");
		}
		for (String foodItem : basket) 
		{
			System.out.println(foodItem);
		}
		System.out.println();
		System.out.println("1. Cancel Order");
		System.out.println("2. Remove Food Item");
		System.out.println("3. Proceed to Payment");
		System.out.println();
		System.out.print("Enter the option : ");
		int opt =sc.nextInt();
		System.out.println();
	}
}
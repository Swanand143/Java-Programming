/*
1. We Can used the Static Members in Static Context Directly.
2. We Can used the non-static Memebrs in non-static Context Directly.
3. We Can used the Static Members in Non-Static Context Directly.
4. We cannot used the non-static members inside the static context directly, 
   we need to create an object first.

NOTE:
5. If we try to create an Object inside the static context directly so it is 
   possible, i.e this object is created at the class loading Process. 
6. 
*/

class P02_Stat_NonStatMembersAccessing{
	
	static int statVar = 10; // Static variable

	int nonStatVar = 20; // non-static variable

	// static Block
	static
	{
		System.out.println("From Static Block 1 (statVar): " + statVar);
	}

	// Non-Static Block
	{
		System.out.println("\nFrom Non-Static Block 1 (nonStatVar): " + nonStatVar);
	}

	// static Block
	static
	{
		// P02_ExecutionFlowWithMethods obj1 = new P02_ExecutionFlowWithMethods();
		// System.out.println("From Static Block 2 (nonStatVar): " + nonStatVar);
		System.out.println("From Static Block 2 (statVar): " + statVar);
	}

	// Non-Static Block
	{
		System.out.println("From Non-Static Block 2 (statVar): " + statVar);
	}



	// main() Method
	public static void main(String[] args) {
		System.out.println("\n------| Main Method Start |------");

		System.out.println("\nObject Created!...");
		P02_Stat_NonStatMembersAccessing obj1 = new P02_Stat_NonStatMembersAccessing();


		System.out.println("\n------| Main Method Ends |------");
	}


	// Static Methods 
	public static void displayMethod1()
	{
		System.out.println("From Static Method Block 1");
		displayMethod2();
	}

	public static void displayMethod2()
	{
		System.out.println("From Static Method Block 2");
	}

	// Non-Static Methods
	public void displayMethod3()
	{
		System.out.println("From Non-Static Method Block 1");
	} 

	public void displayMethod4()
	{
		System.out.println("From Non-Static Method Block 2");
	} 

}
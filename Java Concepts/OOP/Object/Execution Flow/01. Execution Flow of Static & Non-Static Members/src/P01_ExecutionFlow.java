/*
----------| Execution Flow of Static and Non-Static Members |--------------

When Main method is in the Same Class-------------> 

1. If we have a class with static & non static members so what is the execution flow? :
2. Static Member are Executed Before the actual execution of main() Method Starts.

	i) Static Initializers(static block executed First)

3. After Static Members Execution done the main() method i.e actual execution starts
4. If any Object creation Statement is there so Now Object is created and starts it's
   loading Process:
	
	ii) Constructor Starts---> {(LI) First Executes (Non-Static initializers(non-static block))}

5. i.e
		i) Static Initializers (static block executed First)
		ii) Constructor Starts
				1) Non-Static Initializers (non-static block Executes)
			Constructor Ends

6. This Execution Flow Done If Main() Method is in Same Class i.e in Blueprint
*/

class P01_ExecutionFlow{
	
	static int statVar = 10; // Static variables

	int nonStatVar = 20; // non-static variables

	// static & non-static Blocks Mixed
	static
	{
		System.out.println("From Static Block 1 (statVar): " + statVar);
	}

	static
	{
		System.out.println("From Static Block 2 (statVar): " + statVar);
	}

	{
		System.out.println("\nFrom Non-Static Block 1 (nonStatVar): " + nonStatVar);
	}

	static
	{
		System.out.println("From Static Block 3 (statVar): " + statVar);
	}

	{
		System.out.println("From Non-Static Block 2 (nonStatVar): " + nonStatVar);
	}

	{
		System.out.println("From Non-Static Block 3 (nonStatVar): " + nonStatVar);
	}

	// main() Method
	public static void main(String[] args) {
		System.out.println("\n------| Main Method Start |------");

		P01_ExecutionFlow obj1 = new P01_ExecutionFlow();

		System.out.println("\n------| Main Method Ends |------");
	}

}
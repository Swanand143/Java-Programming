/*
1. How the Constructor Chaining Work?
2. Contuctor chaining means calling constructor continuosly one after another.
3. This Calling is happs using this() statement.
4. In Java, one constructor can call another constructor in the same class using 
   this(...).
5. this() is a constructor call that is used to invoke another constructor from 
   the same class.
6. this() is must be the first line inside a constructor.
7. It helps in constructor chaining to reduce code duplication.
8. It can only be used once per constructor.

9. Use this when Object variable and parameter/ Local Var have same name.
10. Use this() when you want to reuse constructor code and avoid repetition.
11. Used this() to call another constructor in the same class

12. 🔸 this → points to current object
	🔸 this() → calls another constructor of same class
	✨ Both are useful in constructor and object handling in OOP.

13. When we pass the actual argms in DriverClass in constructor then thoese all 
    parameter are copied at same time and Compiler check is any constructor in 
    blueprint that matches the all arms type of in len, then the all parameter 
    are copied in constructor formal args, then inside the constructor body that have a 1st statemnet this(args), this searches is any constructor in blue print that have the same work does so that time we use this() so inside this
    the constructor pass the para and this calls another constructor.
14. a One Constructor is cannot call itself.  
*/

class Form{

	// Attributes/ Properties
	String name;
	long phno;
	long tel;
	char gen;
	String blood;
	String email;
	String dob;

	// no-args constructor is mandatory to add in each program it's a duty of programer
	Form()
	{
		System.out.println("-----| From Constructor 1 |-----");
	}

	// Constructor Overloadings
	Form(String name, long phno, char gen, String dob){
		System.out.println("-----| From Constructor 2 |-----");
		this.name = name; // here assigning a values one by one
		this.phno = phno;
		this.gen = gen;
		this.dob = dob;
	}

	Form(String name, long phno, char gen, String dob, long tel){

		this(name, phno, gen, dob); // it is a constructor call statement to find is any contructor in a same class that accepts these given args
		System.out.println("-----| From Constructor 3 |-----");
		this.tel = tel;  // at last this statement is executes
	}

	Form(String name, long phno, char gen, String dob, long tel, String blood){
		
		this(name, phno, gen, dob, tel);
		System.out.println("-----| From Constructor 4 |-----");
		this.blood = blood;
	}

	Form(String name, long phno, char gen, String dob, long tel, String blood, String email){
		
		this(name, phno, gen, dob, tel, blood);
		System.out.println("-----| From Constructor 5 |-----");
		this.email = email;
	}


	// Actions/ Behaviours
	public void displayForm(){
		System.out.println("Name : " + name);
		System.out.println("Phone No. : " + phno);
		System.out.println("Tel No. : " + tel);
		System.out.println("Gender : " + gen);
		System.out.println("Blood : " + blood);
		System.out.println("Email : " + email);
		System.out.println("DOB : " + dob);
	}
}
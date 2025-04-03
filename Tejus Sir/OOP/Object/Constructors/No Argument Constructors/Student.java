class Student
{
	String name ;
	int age ;
	String coll ;
	String degree;
	int roll ;
	
	Student()//no args constructor declared by programmer
	{
		System.out.println("From no args constructor");
		System.out.println(this);//print current object refernce
	}
	
	public void displayStudent()
	{
		String name = "Mighty Raju";//local variable declared
		System.out.println(name);//printing the local variable //Mighty Raju
		System.out.println(this.name);//print the non-static variable that is stored in object //Raju
		System.out.println(this);//prints the current object reference
		System.out.println(age);//21
		System.out.println(coll);//FC College
		System.out.println(degree);//BE
		System.out.println(roll);//2134
	}
}
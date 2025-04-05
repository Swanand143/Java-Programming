class Form
{
	String name ;
	long phon ;
	long tel ;
	char gen ;
	String blood ;
	String email ;
	String dob ;
	
	Form()// no-args costructor
	{
	}
	
	Form(String name,long phon,char gen,String dob)
	{
		this.name = name ;
		this.phon = phon ;
		this.gen = gen ;
		this.dob = dob ;
	}
	
	Form(String name,long phon,char gen,String dob,long tel)
	{
		this.name = name ;
		this.phon = phon ;
		this.gen = gen ;
		this.dob = dob ;
		this.tel = tel ;
	}
	
	Form(String name,long phon,char gen,String dob,long tel,String blood)
	{
		this.name = name ;
		this.phon = phon ;
		this.gen = gen ;
		this.dob = dob ;
		this.tel = tel ;
		this.blood = blood ;
	}
	
	Form(String name,long phon,char gen,String dob,long tel,String blood,String email)
	{
		this.name = name ;
		this.phon = phon ;
		this.gen = gen ;
		this.dob = dob ;
		this.tel = tel ;
		this.blood = blood ;
		this.email = email ;
	}
	
	public void displayForms()
	{
		System.out.println("Name : "+name);
		System.out.println("Phone No : "+phon);
		System.out.println("Gender : "+gen);
		System.out.println("DOB : "+dob);
		System.out.println("Tel : "+tel);
		System.out.println("Blood Grp : "+blood);
		System.out.println("Email ID : "+email);
		System.out.println("---------------------");
	}
}
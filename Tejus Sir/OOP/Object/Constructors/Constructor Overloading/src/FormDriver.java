class FormDriver 
{
	public static void main(String[] args) 
	{
		Form f1 = new Form();
		f1.displayForms();
		
		Form f2 = new Form("Raju",12345678l,'M',"12/02/2003");
		f2.displayForms();
		
		Form f3 = new Form("Rani",78894561l,'F',"25/10/2004",54675312l,"O+","rani@gmail.com");
		f3.displayForms();
	}
}

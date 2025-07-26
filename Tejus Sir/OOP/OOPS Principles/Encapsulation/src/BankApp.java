class BankApp 
{
	private String username ;
	private String bankName ;
	private long accno ;
	private int pin ;
	private String ifsc ;
	private double balance ;
	
	BankApp(String userName,String bankName,long accno,int pin,String ifsc)
	{
		username = userName ;
		this.bankName = bankName ;
		this.accno = accno ;
		this.pin = pin ;
		this.ifsc = ifsc ;
	}
}

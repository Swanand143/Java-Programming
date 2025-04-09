package Encapsulation;

public class BankApp {
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
	
	public String getUserName()
	{
		return username ;
	}
	
	public String getBankName()
	{
		return bankName ;
	}
	
	public long getAccNo()
	{
		return accno ;
	}
	
	public void setPin(long accno, int oldPin, int newPin)
	{
		if (this.accno == accno && pin == oldPin) {
			
			pin = newPin ;
		    System.out.println("Pin updated!");
		    
		}
		else {
			System.out.println("Invalid Credentials!");
		}
	}
	
	public String getIfsc()
	{
		return 	ifsc ;
	}
	
	public double getBalance(long accno, int pin)
	{
		if (this.accno==accno && this.pin == pin) {
			
			return balance ;
		}
		else {
			System.out.println("Invalid Credentials!");
		}
		return 0;
	}
	
	public void credit(long accno, int pin, double amt)
	{
		if (this.accno==accno && this.pin==pin) {
			balance+=amt;
			System.out.println("Amount Credited!");
		}
		else {
			System.out.println("Invalid Credentials!");
		}
		
	}
	
	public void debit(long accno, int pin, double amt)
	{
		if (this.accno==accno && this.pin==pin) {
			if (this.balance>=1000) {
				if (amt>0) {
					balance-=amt;
					System.out.println("Amount Debited");
				}
				else {
					System.out.println("Inavalid Amount!");
				}
			}
			else {
				System.out.println("Insufficient balance!");
				
			}
			
		}
		else {
			System.out.println("Invalid Credentials!");
		}
		
	}
}

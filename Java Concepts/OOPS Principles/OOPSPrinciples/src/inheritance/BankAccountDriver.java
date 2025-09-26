package inheritance;

public class BankAccountDriver {
	
	public static void main(String[] args) {
		
		SavingsAccount s1 = new SavingsAccount("Swanand", "SBIN0001166", "SBI", 40708446920l, 2468, "Akole", 8390176037l, 22000, 4.50, "Savings");
		s1.displayBankAccount();
		System.out.println("--------------------------");
		s1.displaySavingsAccount();
	}

}

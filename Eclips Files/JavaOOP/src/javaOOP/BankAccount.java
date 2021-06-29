package javaOOP;

public class BankAccount {
	
	public String AccountName;
	public String accountEmail; // This is another properties
	public String username;
	public String passward;
	public int moneyDeposited;
	public static int numberofUsers;
	public int accountNumber;
	
	
	// Constructor Overloading
	
	public BankAccount(int accountNumber) {
		
		this.accountNumber = accountNumber;
			
			
			}
	
	public BankAccount() {
		
		System.out.println("object with no constructor");
		
	}
	
	//Method or function overloading
	public void depositeMoney() {
		
		
		
	}
	
	
	public void depositeMoney(String x) {
		
		
		
	}
	
	public void withdrowMoney() {
		
		
	}	
	public void transferMoney() {
		
		
			
	
	}
	
	public void changeAccountEmail() {
		
		
		
	}

}

package mainRun;

import javaOOP.BankAccount;

public class BankRun {

	public static void main(String[] args) {
		
		BankAccount user1 = new BankAccount(243354);
		BankAccount user2 = new BankAccount(44465);
		
		
		// Declaring a variable
		BankAccount user3;
		
		// Initialized the variable
		user3 = new BankAccount(465465);
		
		
		BankAccount user4 = new BankAccount();
		
		
		System.out.println(user1.accountNumber);
		System.out.println(user4.accountNumber);
		user1.accountEmail="Web@gmail.com";
		user3.AccountName="Bob Vence";
		System.out.println(user1.accountEmail);

	

}}

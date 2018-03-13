package mod2.test;

import labs3.Account;
import labs3.Bank;
import labs3.CheckingAccount;
import labs3.Customer;
import labs3.SavingsAccount;

public class TestAccount {
public static void main(String[] args) {
	Bank myBank = Bank.getBank();
	
	Customer firstCustomer = new Customer("John Doe");
	Customer secondCustomer = new Customer("Jane Doe");
	
	SavingsAccount johnSavings 	= new SavingsAccount(1000, 5);
	CheckingAccount johnAccount = new CheckingAccount(5000,1000);
	CheckingAccount janeAccount = new CheckingAccount(500,100);
	
	firstCustomer.addAccount(johnSavings);
	firstCustomer.addAccount(johnAccount);
	secondCustomer.addAccount(janeAccount);
	
	myBank.addCustomer(firstCustomer);
	myBank.addCustomer(secondCustomer);
	
	System.out.println(myBank.getCustomer(0));
	System.out.println(myBank.getCustomer(1));
	
	myBank.getCustomer(0).getAccount(0).deposit(2000);
	myBank.getCustomer(0).getAccount(1).withdraw(5500);
	((SavingsAccount) myBank.getCustomer(0).getAccount(0)).addInterstRate();
	System.out.println("");
	System.out.println(myBank.getCustomer(0));
	System.out.println(myBank.getCustomer(1));
	
}   
}

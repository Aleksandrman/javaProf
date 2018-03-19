package com.mybank.data;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;

public class DataSource {
private File dataFile;

public DataSource(String dataFilePath) {
	dataFile = new File(dataFilePath);
}
public void loadData() throws IOException {
	Scanner input = new Scanner(dataFile);
	Bank bank = Bank.getBank();
	Customer customer;
	
	int numOfCustomers = input.nextInt();
	for (int i = 0; i < numOfCustomers; i++) {
		String firstName = input.next();
		String lastName = input.next();
		bank.addCustomer(new Customer(firstName, lastName));
		customer = bank.getCustomer(i);
		
		int numOfAccounts = input.nextInt();
		while(numOfAccounts-->0) {
			char accountType = input.next().charAt(0);
			switch (accountType) {
			case 'S': float initBalance=input.nextFloat();
			float interestRate=input.nextFloat();
			customer.addAccount(new SavingsAccount(initBalance, interestRate));
				break;
			case 'C':float initBalanceC=input.nextFloat();
			float overdtaftAmount=input.nextFloat();
			customer.addAccount(new CheckingAccount(initBalanceC, overdtaftAmount));
				break;
			default:
				break;
			}
		}
		
	}
}
}

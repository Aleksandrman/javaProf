package labs3;

import java.util.ArrayList;

public class Bank {

	private  ArrayList<Customer> customers = new ArrayList<>();
	private  int numOfClients = 0;	
	static Bank bank = new Bank();
	
	private Bank() {}
	
	public  Customer getCustomer(int custNo) {
	if(custNo<customers.size())
		return customers.get(custNo);
	return null;
	}
	
	public static Bank getBank() {
		return bank;
		 
	}
	
	public void addCustomer(Customer newCustomer) {
		customers.add(newCustomer);
		numOfClients++;
	}

	/**
	 * @return the numOfClients
	 */
	public int getNumOfClients() {
		return numOfClients;
	}
	
}

package labs3;

public class Bank {

	private static Customer[] customers = new Customer[1000];
	private static int numOfClients = 0;	
	static Bank bank = new Bank();
	
	private Bank() {
			
	}
	
	public static Customer getCustomer(int custNo) {
	if(custNo<customers.length)
		return customers[custNo];
	return null;
	}
	
	public static Bank getBank() {
		return bank;
		 
	}
	
	public static void addCustomer(Customer newCustomer) {
		customers[numOfClients] =newCustomer;
		numOfClients++;
	}

	/**
	 * @return the numOfClients
	 */
	public static int getNumOfClients() {
		return numOfClients;
	}
	
}

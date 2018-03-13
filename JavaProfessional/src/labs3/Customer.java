package labs3;

public class Customer {
private Account[] accounts;
private String fullName;
private int costumerNumber;
private static int costumerNumberBase = 1000;
private int numOfAccounts;


public Customer(String fullName) {
	accounts = new Account[10];
	this.fullName = fullName;
	this.costumerNumber = costumerNumberBase++;
}
public Account getAccount(int accNo) {
	if (accNo<accounts.length && numOfAccounts!=0)
		return accounts[accNo];
	return null;
}
public void addAccount(Account acc) {
	accounts[numOfAccounts] = acc;
	numOfAccounts++;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	String s = "Customer: fullName=" + fullName + ", costumerNumber=" + costumerNumber + ", numOfAccounts=" + numOfAccounts;
	for(int i= 0; i <this.numOfAccounts; i++) {
		Account acc = getAccount(i);
		if (acc instanceof SavingsAccount)
			s = s+ "\n \t"+ (i+1)+ " Saving account with interest rate %"+ ((SavingsAccount)acc).getInterestRate();
		else 
			s= s+"\n \t"+ (i+1)+" Checking account with overdraft $"+ ((CheckingAccount)acc).getOverdraftAmount();
		s= s+ "\t balance $" + acc.getBalance();
	}
		s=s+ "\n";
	
	return s;
}


}//end class

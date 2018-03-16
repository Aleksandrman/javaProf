package labs3;

import java.util.ArrayList;

public class Customer {
private ArrayList<Account> accounts;
private String firstName;
private String lastName;



private int costumerNumber;
private static int costumerNumberBase = 1000;
private int numOfAccounts;


public Customer(String firstName,String lastName) {
	accounts  = new ArrayList<>();
	this.firstName = firstName;
	this.lastName = lastName;
	this.costumerNumber = costumerNumberBase++;
}
public Account getAccount(int accNo) {
	if (accNo<accounts.size() && numOfAccounts!=0)
		return accounts.get(accNo);
	return null;
}
public void addAccount(Account acc) {
	accounts.add(acc);
	numOfAccounts++;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	String s = "Customer: fullName=" + firstName + " " + lastName +", costumerNumber=" + costumerNumber + ", numOfAccounts=" + numOfAccounts;
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

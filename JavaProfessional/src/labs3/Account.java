package labs3;
/**
 * bank Account class
 * @author Aleksandrman the balance
 */
public class Account {
protected double balance;

/**
 * construction that provides initial balance
 * @param balance a positive account balance
 */

protected Account(double balance) {
	if(balance>= 0)	
	this.balance = balance;
	else 
		this.balance = 0;
}
Account() {
	this.balance = 0;
}



/**
 * method to check account balance
 * @return the balance
 */
public double getBalance() {
	return balance;
}

/**
 * Method to add money to account
 * @param amt a positive amount of money
 */

public boolean deposit(double amt) {
	if(amt>0) {
		balance += amt;
		return true;
	}
	return false;
}

/**
 * method to withdraw money	
 * @param amt a positive amount of money
 */


public boolean withdraw(double amt) {
	if(amt<=balance) {
		balance -= amt;
		return true;
	}
	return false;
}
} // end class

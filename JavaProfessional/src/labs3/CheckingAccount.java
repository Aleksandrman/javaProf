package labs3;

import javax.swing.plaf.basic.BasicButtonListener;

public class CheckingAccount extends Account{
	private double overdraftAmount;
	public CheckingAccount(double initBalance, double overdraftAmount){
		balance = initBalance;
		this.overdraftAmount = overdraftAmount;
	}
	public CheckingAccount(double initBalance){
			this(initBalance,0);
	}
	@Override
	public boolean withdraw(double amt) throws OverdraftException {
		if(amt<=balance+overdraftAmount) {
			balance -= amt;
			return true;
		}
		throw new OverdraftException(amt - balance - overdraftAmount, "Error! Insufficlient funds!");
	}
	/**
	 * @return the overdraftAmount
	 */
	public double getOverdraftAmount() {
		return overdraftAmount;
	}

}

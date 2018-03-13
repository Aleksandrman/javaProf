package labs3;

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
	public boolean withdraw(double amt) {
		if(amt<=balance+overdraftAmount) {
			balance -= amt;
			return true;
		}
		return false;
	}
	/**
	 * @return the overdraftAmount
	 */
	public double getOverdraftAmount() {
		return overdraftAmount;
	}

}

package labs3;

public class SavingsAccount extends Account{
	private double interestRate;
	/**
	 * 
	 * @param initBalance initial deposit 
	 * @param interestRate initial percent 
	 * */
	public SavingsAccount(double initBalance, double interestRate){
		balance = initBalance;
		this.interestRate =interestRate;
	}
public void addInterstRate() {
	this.balance = this.balance+this.balance*interestRate/100;	
}
/**
 * @return the interestRate
 */
public double getInterestRate() {
	return interestRate;
}

}


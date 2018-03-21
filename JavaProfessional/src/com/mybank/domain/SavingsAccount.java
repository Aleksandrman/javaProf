package com.mybank.domain;

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
	this.balance = this.balance*(1+interestRate);	
}
/**
 * @return the interestRate
 */
public double getInterestRate() {
	return interestRate;
}

}


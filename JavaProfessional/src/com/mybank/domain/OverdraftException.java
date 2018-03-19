package com.mybank.domain;

/**
 * @author chag
 *
 */
public class OverdraftException extends Exception{
	private double deficit;
	
		
public OverdraftException(double difocite, String message) {
		super(message);
		this.deficit = difocite;
	}


public double getDeficit() {
	return deficit;
}
		
}

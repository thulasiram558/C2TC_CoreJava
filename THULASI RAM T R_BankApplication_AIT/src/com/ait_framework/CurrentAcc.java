package com.ait_framework;

public abstract class CurrentAcc extends BankAcc{
	
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
		
	}
	
	private final float creditLimit;

	public float getCreditLimit() {
		return creditLimit;
	}
	@Override
	public void withdraw(float accBal) {
		
	}
	
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}

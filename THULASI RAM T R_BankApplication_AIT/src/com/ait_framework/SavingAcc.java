package com.ait_framework;

public abstract class SavingAcc extends BankAcc {

	private boolean isSalaried;
	private static final float MINBAL = 0;
	
	public boolean isSalaried() {
		return isSalaried;
	}
	
	public static float getMinbal() {
		return MINBAL;
	}

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;	
	}

	@Override
	public void withdraw(float accBal) {
		}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", isSalaried()=" + isSalaried() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()+ "]";
	
		
	}
	
}

package application;

import framework.SavingAcc;

public class GSSavingAcc extends SavingAcc {

	public GSSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float accBal)
	{
		System.out.println("dear salary user,your withdraw accbal :"+getAccBal());
	}
	@Override
	public String toString() {
		return "GSSavingAcc [isSalary()=" + isSalary() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + "]";
	}

}
		
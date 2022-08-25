package application;

import framework.CurrentAcc;

public class GSCurrentAcc extends CurrentAcc {

	public GSCurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);

	}
	public void withdraw(float accBal)
	{
		System.out.println("dear current account user,your accbal is:"+getAccBal()+"creditLimit"+ getCreditLimit());
	}

}

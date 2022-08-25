package framework;

public class SavingAcc extends BankAcc {
	private boolean isSalary;
	private static final float creditLimit = 0;

	public boolean isSalary() {
		return isSalary;
	}

	public static float getCreditlimit() {
		return creditLimit;
	}

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}

	@Override
	public void withdraw(float accBal) {

	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + "]";
	}

}
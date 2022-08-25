package framework;

public class CurrentAcc extends BankAcc {
	private float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal,float creditlimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void withdraw(float accBal) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + "]";
	}
	public float getCreditLimit() {
		return creditLimit;
	}
	
	

}
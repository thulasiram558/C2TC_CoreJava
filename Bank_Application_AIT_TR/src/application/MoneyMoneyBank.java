package application;
import framework.SavingAcc;
import framework.CurrentAcc;
import framework.BankFactory;
public class MoneyMoneyBank implements BankFactory{
	
	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalary) {
		SavingAcc SavingAcc=new GSSavingAcc(AccNo, accNm, accBal, isSalary);
		return SavingAcc;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		   CurrentAcc CurrentAcc=new GSCurrentAcc(AccNo, accNm, accBal, creditLimit);
		   return CurrentAcc;
	}
}
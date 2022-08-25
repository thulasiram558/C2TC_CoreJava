package client;

import application.GSCurrentAcc;
import application.GSSavingAcc;
import application.MoneyMoneyBank;

public class MoneyMoneyBankclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//saving account creation
		MoneyMoneyBank obj=new MoneyMoneyBank();
		GSSavingAcc TR=(GSSavingAcc) obj.getNewSavingAcc(124, "TR", 600.0f, true);
		TR.withdraw(TR.getAccBal());
		
		//current account creation
		GSCurrentAcc Prashanth=(GSCurrentAcc) obj.getNewCurrentAcc(121,"Prashanth",800.0f,20.0f);
		Prashanth.withdraw(Prashanth.getAccBal());
	}

}
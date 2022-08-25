package com.ait_framework;

public interface BankFactory {
public SavingAcc getNewSavingsAcc(int accNo,String accNm, float accBal, boolean isSalaried);
public CurrentAcc getNewCurrentAcc(int accNo,String accNm, float accBal,float creditLimit);
}


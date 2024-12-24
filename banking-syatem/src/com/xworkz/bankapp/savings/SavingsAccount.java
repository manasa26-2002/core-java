package com.xworkz.bankapp.savings;

import com.xworkz.bankapp.BankAccount;

public class SavingsAccount extends BankAccount {

  public  double intrest;

    public SavingsAccount(){
        System.out.println("savingsaccount invoked");
    }
    public SavingsAccount(double minBalance){
        super.setBalance(minBalance);
        System.out.println("savings acc cons invoked");
    }
    public SavingsAccount(double intrest,double minBalance){
        super.setBalance(minBalance);
        this.intrest = intrest;
        System.out.println("savingAcc cons cons invoked");
    }
    public void calculateRateOfIntreset(){
        double calculatedIntrest = (super.getBalance()*intrest/100);
        super.credit(calculatedIntrest);
    }
}

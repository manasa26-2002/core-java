package com.xworkz.bankapp;

public class BankAccount extends Object {

    public BankAccount(){
        System.out.println("bankAcc const invoked");
    }

    private double balance;



    public void debit(double amount ){
        if(amount <=balance)
            balance = balance-amount;
            //System.out.println("amt debited is");
    }

    public void credit(double amount){
        if(amount >0)
            balance = balance+amount;
            //System.out.println("amt credited is");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
        public void transfer(BankAccount beneficiaryAccount , double amount){
            this.debit(amount);
            beneficiaryAccount.credit(amount);

    }
}

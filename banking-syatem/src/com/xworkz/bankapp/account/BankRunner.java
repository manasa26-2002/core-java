package com.xworkz.bankapp.account;

import com.xworkz.bankapp.BankAccount;
import com.xworkz.bankapp.current.CurrentAccount;
import com.xworkz.bankapp.savings.SavingsAccount;

public class BankRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.intrest =2.80;
        savingsAccount.credit(1000);
        savingsAccount.credit(657);

        System.out.println("amt credited is:"+savingsAccount.getBalance());

         savingsAccount.calculateRateOfIntreset();
        System.out.println("the available balance is:"+savingsAccount.getBalance());

        SavingsAccount myAcc = new SavingsAccount();
        myAcc.intrest = 3.00;
        myAcc.credit(10000);
        System.out.println("balance in my acc is:"+myAcc.getBalance());

        myAcc.calculateRateOfIntreset();
        System.out.println("balance after roi in my acc :"+myAcc.getBalance());

        SavingsAccount frndsAcc = new SavingsAccount();
        frndsAcc.intrest = 3.50;
        frndsAcc.credit(500);
        frndsAcc.credit(500);
        System.out.println("frnds amt credited is:"+frndsAcc.getBalance());

        frndsAcc.calculateRateOfIntreset();
        System.out.println("available balance frnd acc is:"+frndsAcc.getBalance());

         SavingsAccount fathersAcc = new SavingsAccount();
         fathersAcc.intrest = 3.50;
         fathersAcc.credit(5000);
        System.out.println("fathers acc balance  is:"+fathersAcc.getBalance());

        fathersAcc.calculateRateOfIntreset();
        System.out.println("balance after roi is:"+fathersAcc.getBalance());

        SavingsAccount broAcc = new SavingsAccount();
        broAcc.intrest = 2.80;
        broAcc.credit(4000);
        System.out.println("balance in bro acc is:"+broAcc.getBalance());

        broAcc.calculateRateOfIntreset();
        System.out.println("balance after roi in bro acc :"+broAcc.getBalance());

        SavingsAccount momAcc = new SavingsAccount();
        momAcc.intrest=3.00;
        momAcc.credit(4000);
        System.out.println("balance in moms acc is:"+momAcc.getBalance());

        momAcc.calculateRateOfIntreset();
        System.out.println("balance after roi in mom acc :"+momAcc.getBalance());

        SavingsAccount sisAcc = new SavingsAccount();
        sisAcc.intrest = 2.50;
        sisAcc.credit(200);
        System.out.println("balance in sis acc:"+sisAcc.getBalance());

        sisAcc.calculateRateOfIntreset();
        System.out.println("balance after roi in sis acc is:"+sisAcc.getBalance());


        fathersAcc.transfer(frndsAcc,2000);
        System.out.println("fathers acc balance  is:"+fathersAcc.getBalance());
        System.out.println("available balance frnd acc is:"+frndsAcc.getBalance());

        myAcc.transfer(frndsAcc,1000);
        System.out.println("fathers acc balance  is:"+fathersAcc.getBalance());
        System.out.println("balance my acc is:"+myAcc.getBalance());


        myAcc.transfer(momAcc,1000);
        System.out.println("fathers acc balance  is:"+momAcc.getBalance());
        System.out.println("balance my acc is:"+myAcc.getBalance());

        myAcc.transfer(broAcc,1000);
        System.out.println("fathers acc balance  is:"+broAcc.getBalance());
        System.out.println("balance my acc is:"+myAcc.getBalance());

        myAcc.transfer(sisAcc,1000);
        System.out.println("fathers acc balance  is:"+sisAcc.getBalance());
        System.out.println("balance my acc is:"+myAcc.getBalance());

        myAcc.transfer(fathersAcc,1000);
        System.out.println("fathers acc balance  is:"+fathersAcc.getBalance());
        System.out.println("balance my acc is:"+myAcc.getBalance());

        BankAccount bankAccount = new BankAccount();
       bankAccount.credit(500);

        CurrentAccount currentAccount = new CurrentAccount();
        System.out.println(currentAccount);//implicit calling of to string
        System.out.println(currentAccount.toString());//explicit calling of to string

        System.out.println("main ended");
    }
}

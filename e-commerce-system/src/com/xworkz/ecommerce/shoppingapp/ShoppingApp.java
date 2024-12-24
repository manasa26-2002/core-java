package com.xworkz.ecommerce.shoppingapp;

public class ShoppingApp {

    public ShoppingApp(){
        System.out.println("shoppingapp cons invoked");
    }

    private double balance;
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void logIn(String email){
        if(email !=null && password !=null )
            System.out.println("login successfull");
    }

      public void debit(double amount){
          if(amount <=balance)
              balance= balance-amount;
      }

      public void credit(double amount){
         if(amount>0)
             balance=balance+amount;
      }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

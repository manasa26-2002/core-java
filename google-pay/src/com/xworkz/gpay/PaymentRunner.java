package com.xworkz.gpay;
import com.xworkz.gpay.payment.Payment;
public class PaymentRunner {

    public static void main(String[] args){

        Payment p2 = new Payment();
        p2.setUserName("anusha");
        p2.setAmt(1875.78);
        p2.setUserNo("8876523190");
        System.out.println("user name is :"+p2.getUserName());
        System.out.println("the user amt is:"+p2.getAmt());
        System.out.println("the user amt is:"+p2.getAmt());

       // Payment pay = new Payment();
//        pay.setAmt(10000.78);
//        System.out.println("the user amt is:"+pay.getAmt());
//
//
//        Payment p3 = new Payment();
//        p3.setUserNo("9970654312");
//        System.out.println("user no is:"+p3.getUserNo());
    }

}

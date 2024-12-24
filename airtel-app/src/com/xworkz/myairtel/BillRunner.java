package com.xworkz.myairtel;

import com.xworkz.myairtel.bill.Bill;

public class BillRunner {

    public static void main(String[] args) {

        Bill bill = new Bill();
        bill.setBillAmount(999.09);
        System.out.println("the billAmount is :"+bill.getBillAmount());
    }
}
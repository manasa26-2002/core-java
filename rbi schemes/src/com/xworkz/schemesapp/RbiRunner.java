package com.xworkz.schemesapp;

public  class RbiRunner {
    public static void main(String[] args) {

        //abstraction
        RbiSchemes rbiSchemes = new AxisBank();
        String customerService = rbiSchemes.customerService();
        System.out.println(customerService);

    }
}
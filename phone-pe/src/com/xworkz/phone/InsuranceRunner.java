package com.xworkz.phone;

public class InsuranceRunner {
public static void main(String[] args) {

    Insurance i1 = new Insurance();
    i1.setNameOfInsurance("bike insurance");
    i1.setNoOfInsurance(15);
    i1.setUserName("akshay");
    System.out.println(i1.toString());

    Insurance i2 = new Insurance();
    i1.setNameOfInsurance("bike insurance");
    i1.setNoOfInsurance(15);
    i1.setUserName("akshay");
    System.out.println(i1.toString());

    boolean ref =i1.equals(i2);

    System.out.println(i1.hashCode());
    System.out.println(i2.hashCode());
}
}

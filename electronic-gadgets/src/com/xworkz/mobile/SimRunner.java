package com.xworkz.mobile;

import com.xworkz.mobile.sim.Sim;

public class SimRunner {
    public  static void main(String[] args){
        Sim s1 = new Sim();
        s1.setNetworkType("airtel");
        System.out.println("sim network type is:"+s1.getNetworkType());

        Sim s2 = new Sim();
        s2.setPrice(600);
        System.out.println("price of sim is:"+s2.getPrice());

        Sim s3 = new Sim();
        s3.setUserName("asha");
        System.out.println("name of the user is:"+s3.getUserName());
    }
}

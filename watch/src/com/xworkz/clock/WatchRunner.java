package com.xworkz.clock;

public class WatchRunner {
    public static void main(String[] args){

        Watch w1 = new Watch();
        w1.setBrand("rado");
        w1.setColor("black");
        w1.setPrice(5000);
        System.out.println(w1);

        Watch w2 = new Watch();
        w1.setBrand("rado");
        w1.setColor("black");
        w1.setPrice(5000);
        System.out.println(w1.toString());

        boolean r1 = w1.equals(w2);
        System.out.println(r1);

        System.out.println(w1.hashCode());
    }
}

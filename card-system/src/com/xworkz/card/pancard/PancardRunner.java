package com.xworkz.card.pancard;

public class PancardRunner {
    public static void main(String[] args) {

        Pancard p1 = new Pancard();
        p1.setName("Goutham");
        System.out.println("name is:"+p1.getName());

        Pancard p2 = new Pancard();
        p2.setPanNo(8975643);
        System.out.println("pan No :"+p2.getPanNo());

        Pancard p3 = new Pancard();
        p3.setFatherName("ramesh");
        System.out.println("father name:"+p3.getFatherName());

    }
}

package com.xworkz.shopping;

import com.xworkz.shopping.dress.Dress;

public class DressRunner {
    public static void main(String [] args){
        Dress d1 = new Dress();
        d1.setDressColor("black");
        System.out.println("color of dress is:"+d1.getDressColor());

        Dress d2 = new Dress();
        d2.setShopName("zara");
        System.out.println("name of the shop is:"+d2.getShopName());

        Dress d3 = new Dress();
        d3.setPrice(3000);
        System.out.println("price of dress is:"+d3.getPrice());

        Dress d4  = new Dress();
        d4.setDressType("bodycon dress");
        System.out.println("dress type is:"+d4.getDressType());;

    }
}

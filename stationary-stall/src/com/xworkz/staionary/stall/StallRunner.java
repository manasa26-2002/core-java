package com.xworkz.staionary.stall;

import com.xworkz.staionary.items.Items;

public class StallRunner {
    public static void main(String[] args) {
        Stall stall = new Stall();

        Items items = new Items();
        items.setProductName("pen");
        items.setPrice(99.87);
        items.setType("plastic");

        stall.addItems(items);
        System.out.println("product name is:"+items.getProductName());
        System.out.println("product price is:"+items.getPrice());
        System.out.println("product type is:"+items.getType());


    }
}

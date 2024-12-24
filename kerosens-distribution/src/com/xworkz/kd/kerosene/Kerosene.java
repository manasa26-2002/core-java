package com.xworkz.kd.kerosene;

public class Kerosene {
    double price;
    boolean quality;
    int quantity;

    public Kerosene(){
        this(675.34,4,true);
        System.out.println("kerosene cons invoked");
    }
    public Kerosene(double price,int quantity,boolean quality){
        this(true);
        System.out.println("3 arg cons invoked");
        this.price=price;
        this.quality=quality;
        this.quantity=quantity;
    }
    public Kerosene(boolean quality){
        this(459.23);
        System.out.println("1 arg cons invoked");
        this.quality=quality;
    }
    public Kerosene(double price){
        System.out.println("price cons invoked");
        this.price=price;
    }
    public void getKeroseneInfo(){
        System.out.println("kerosene price is:"+price);
        System.out.println("kerosene quality is:"+quality);
        System.out.println("kerosene quantity is:"+quantity);
    }
}

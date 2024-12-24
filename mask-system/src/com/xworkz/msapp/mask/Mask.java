package com.xworkz.msapp.mask;

public class Mask {
    double cost;
    char size;
    String material;

    public Mask(){
        this(50);
        System.out.println("mask cons invoked");
    }

    public Mask(int cost){
        this('m');
        System.out.println("1 arg cons invoked");
        this.cost=cost;
    }
    public Mask(char size){
        this("cotton");
        System.out.println("size cons invoked");
        this.size=size;
    }
    public Mask(String material){
        this(66.76,'m',"nylon");
        System.out.println("material cons invoked");
        this.material=material;
    }
    public Mask(double cost,char size,String material){
        this(80.98,'l');
        System.out.println("3 arg cons invoked");
        this.cost=cost;
        this.size=size;
        this.material=material;
    }
    public Mask(double cost,char size){
        System.out.println("2 args cons invoked");
        this.cost=cost;
        this.size=size;
    }

   public void getMaskInfo(){
       System.out.println("mask cost is:"+cost);
       System.out.println("mask material is:"+material);
       System.out.println("mask size is:"+size);
   }

}

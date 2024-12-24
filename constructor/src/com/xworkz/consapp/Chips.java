package com.xworkz.consapp;

public class Chips {

    String chipsName;
    int cost;
    String chipsType;

    public Chips(){
        this("Doritos");
        System.out.println("no args cons invoked");
    }

    public  Chips(String chipsName){
        this(50,"potatochips");
        System.out.println("1 args cons invoked");
        this.chipsName=chipsName;
    }
    public Chips(int cost,String chipsType){
        System.out.println("2 args cons invoked");
        this.cost=cost;
        this.chipsType=chipsType;
    }

    public void getChipsDetails(){
        System.out.println("name:"+chipsName);
        System.out.println("cost:"+cost);
        System.out.println("type:"+chipsType);
    }
}

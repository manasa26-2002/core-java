package com.xworkz.gadget;

public class ElectronicGadget {

    public ElectronicGadget(){
        System.out.println("the cons is invoked");
    }

    private String electronicName;

    public void electronicName(){
        System.out.println("the name is "+electronicName);
    }

    public String getElectronicName() {
        return electronicName;
    }
}

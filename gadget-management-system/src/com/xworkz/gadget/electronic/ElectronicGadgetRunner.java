package com.xworkz.gadget.electronic;

import com.xworkz.gadget.ElectronicGadget;

public class ElectronicGadgetRunner {
    public static void main(String[] args) {
        ElectronicGadget electronicGadget =new ElectronicGadget();
        electronicGadget.electronicName();
        System.out.println("the  electronic gadget name is "+ electronicGadget.getElectronicName());
    }
}

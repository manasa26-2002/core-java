package com.xworkz.wood.furniture;

public class Furnitures {
    public Furnitures(){
        System.out.println("the cons is invoked");
    }

    private String furnitureName;

    public void furnitureName(){
        System.out.println("the company name is "+furnitureName);
    }

    public String getFurnitureName() {
        return furnitureName;
    }
}

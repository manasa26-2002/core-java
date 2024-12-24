package com.xworkz.sports;

public class Sport {

    public Sport(){
        System.out.println("the cons is invoked");
    }

    private String sportName;

    public void sportName(){
        System.out.println("the name is "+sportName);
    }

    public String getSportName() {
        return sportName;
    }
}

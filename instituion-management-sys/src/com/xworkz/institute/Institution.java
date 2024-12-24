package com.xworkz.institute;

public class Institution {
    public Institution(){
        System.out.println("the cons is invoked");
    }

    private String instuteName;

    public void instuteName(){
        System.out.println("the instuteName is "+instuteName);
    }

    public String getInstuteName() {
        return instuteName;
    }
}

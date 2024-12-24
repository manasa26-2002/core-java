package com.xworkz.movie;

public class Theater {

    public Theater(){
        System.out.println("theater cons is invoked");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void name(String name){
        System.out.println("theater name is:"+name);

    }


}

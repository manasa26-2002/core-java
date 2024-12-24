package com.xworkz.parentapp.child;

import com.xworkz.parentapp.Parent;

public class Child extends Parent {

    public Child(){
        System.out.println("child cons invoked");
    }
//in order to override parent class  ,method signature must be same
    public void business(){
        System.out.println("invoked business() from child");
        System.out.println("software company");
    }

}

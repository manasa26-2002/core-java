package com.xworkz.parentapp.parent;

import com.xworkz.parentapp.Parent;
import com.xworkz.parentapp.child.Child;

public class ParentRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        //Parent ref = new Child();
        Parent ref = new Child();
        ref.business();

        System.out.println("main ended");
    }
}

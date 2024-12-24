package com.xworkz.govern.stategovernment;

import com.xworkz.govern.government.Government;

public class StateGovernment extends Government {

    public static  boolean isBplCardAvailable;

    public void freeEducation(){
        System.out.println("invoked from state government");
        if(isBplCardAvailable==false){
            System.out.println("free education for all students under age 15");
        }else{
            System.out.println("no free education");
        }
    }
}

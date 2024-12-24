package com.xworkz.schemesapp;

public   abstract class AxisBank implements RbiSchemes{


    public AxisBank(){
        
    }
    public String customerService(){
        return "axis bank will provide customer service  ";
    }

    @Override
    public double cashTransaction() {
        return 0;
    }

    @Override
    public void mobileBanking() {

    }
    public abstract void savingsAccount811();



    }


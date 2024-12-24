package com.xworkz.railways.metroTrain;

import com.xworkz.railways.train.Train;

public class MetroTrain extends Train {

    public MetroTrain(){
        System.out.println("metro cons invoked");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("metro cons invoked");
    }

}

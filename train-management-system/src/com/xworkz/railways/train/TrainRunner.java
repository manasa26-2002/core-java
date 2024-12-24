package com.xworkz.railways.train;

import com.xworkz.railways.metroTrain.MetroTrain;
import com.xworkz.railways.urbantrain.UrbanTrain;

public class TrainRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        MetroTrain metro = new MetroTrain();
        metro.TrainNo(8);
        System.out.println("train number is:"+metro.getTrainNo());

        //metro.displayDetails();


    }
}

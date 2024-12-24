package com.xworkz.temple.templeguidelines;

import com.xworkz.temple.GaneshaTemple;
import com.xworkz.temple.TempleGuidelines;

public class Runner {
    public static void main(String[] args) {
        TempleGuidelines templeGuidelines = new GaneshaTemple();
        String ref = templeGuidelines.dressCode();
        String ref1 = templeGuidelines.removeShoes();
        String ref2 = templeGuidelines.avoidDistractions();
        String ref3 = templeGuidelines.avoidSmoking();
        String ref4 = templeGuidelines.avoidDistractions();
        String ref5 = templeGuidelines.beClean();
        String ref6 = templeGuidelines.beRespectful();
        String ref7 = templeGuidelines.ringTheBell();
        String ref8 = templeGuidelines.touchTheThreshold();
        String ref9 = templeGuidelines.payObeisances();

        System.out.println(ref);
        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println(ref3);
        System.out.println(ref4);
        System.out.println(ref5);
        System.out.println(ref6);
        System.out.println(ref7);
        System.out.println(ref8);
        System.out.println(ref9);
    }
}

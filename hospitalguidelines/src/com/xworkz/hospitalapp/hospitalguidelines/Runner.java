package com.xworkz.hospitalapp.hospitalguidelines;

import com.xworkz.hospitalapp.HospitalGuidelines;
import com.xworkz.hospitalapp.ManipalHospital;

public class Runner {
    public static void main(String[] args) {

       HospitalGuidelines hospitalGuidelines = new ManipalHospital();
         String ref1=hospitalGuidelines.maintainHygene();
        System.out.println(ref1);

        HospitalGuidelines hospitalGuidelines1 = new ManipalHospital();
        String ref2 = hospitalGuidelines1.emergencyCare();
        System.out.println(ref2);

        HospitalGuidelines hospitalGuidelines2 = new ManipalHospital();
        String ref3 = hospitalGuidelines2.maintainDistance();
        System.out.println(ref3);
    }
}
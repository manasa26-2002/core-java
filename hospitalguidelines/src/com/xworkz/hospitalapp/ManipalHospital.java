package com.xworkz.hospitalapp;

public  class ManipalHospital implements HospitalGuidelines{


    @Override
    public String maintainHygene() {
        return "hygiene should be maintaned in hospital";
        // System.out.println("manipal hospital is following hospital guidelines");
    }

    @Override
    public String emergencyCare() {
    return "emergency care should be taken";
    }

    @Override
    public String maintainDistance() {
     return "distance should be maintained";
    }

}

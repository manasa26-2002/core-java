package com.xworkz.clock;

import lombok.ToString;


public class Watch {
    private String brand;
    private String color;
    private double price;

    public Watch(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "watch-(brand = "+this.brand+" ," +
                "color"+this.color +" ," +
                "price"+this.price+")";
    }
//@Override
//public int hashCode(){
//return super.hashCode();
}

//    @Override
//    public boolean equals(Object obj){
//      Watch watch = new Watch();
//     if(this.brand.equals(watch.brand))
//         return true;
//
//     if(this.color.equals(watch.color))
//         return true;
//
//     if(this.price==(watch.price))
//         return true;
//
//     return false;
//    }

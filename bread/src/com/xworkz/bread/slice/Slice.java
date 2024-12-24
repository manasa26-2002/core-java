package com.xworkz.bread.slice;

import java.util.Objects;

public class Slice {

    private String brand;
    private String noOfSlices;
    private int price;
    private String type;

    public Slice(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNoOfSlices() {
        return noOfSlices;
    }

    public void setNoOfSlices(String noOfSlices) {
        this.noOfSlices = noOfSlices;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        Slice movies = (Slice) obj; //explicit type casting
        if(this.brand.equals(movies.brand))
            return true;
        if(this.noOfSlices == movies.noOfSlices)
            return true;

        if(this.price==(movies.price) )
            return true;

        if(this.type.equals(movies.type) )
            return true;

        return false;
    }

    @Override
    public String toString(){
        return "movie-(movieName = "+this.brand+" ," +
                "joner"+this.noOfSlices +" ," +
                "noOfMovies"+this.price +"," +
                "language"+this.type+")";
    }
}

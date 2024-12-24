package com.xworkz.phone;

public class Insurance {
    private String nameOfInsurance;
    private int noOfInsurance;
    private String userName;

    public Insurance(){

    }

    public String getNameOfInsurance() {
        return nameOfInsurance;
    }

    public void setNameOfInsurance(String nameOfInsurance) {
        this.nameOfInsurance = nameOfInsurance;
    }

    public int getNoOfInsurance() {
        return noOfInsurance;
    }

    public void setNoOfInsurance(int noOfInsurance) {
        this.noOfInsurance = noOfInsurance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object obj) {
        Insurance insurance = (Insurance) obj;
        if(this.noOfInsurance == insurance.noOfInsurance && this.nameOfInsurance == insurance.nameOfInsurance &&
        this.userName == insurance.userName)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return  "insurance-(insuranceName = "+this.nameOfInsurance+" ," +
                "noOfInsurance"+this.noOfInsurance +" ," +
                "user"+this.userName +")";
    }
}

package com.xworkz.railways.train;

public class Train {

    public Train(){
        System.out.println("train cons invoked");
    }

    private int trainNo;
    private String source;
    private String destination;

   public void displayDetails(){
       System.out.println("train no is:"+trainNo);
       System.out.println("train source is:"+source);
       System.out.println("traing destination is:"+destination);
   }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void TrainNo(int number){
       if(trainNo!=0){
           System.out.println("trainNo cons invoked");
       }
    }
}

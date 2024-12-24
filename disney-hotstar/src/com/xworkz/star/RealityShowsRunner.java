package com.xworkz.star;

public class RealityShowsRunner {
    public  static  void main(String[] args){
        RealityShows r1 = new RealityShows();
        r1.setShowName("bigg boss");
        System.out.println("name of the show is :"+r1.getShowName());

        RealityShows r2 = new RealityShows();
        r2.setLanguage("kannada");
        System.out.println("language is:"+r2.getLanguage());

        RealityShows r3 = new RealityShows();
        r3.setNoOfParticipants(18);
        System.out.println("no of participants are:"+r3.getNoOfParticipants());

        RealityShows r4 = new RealityShows();
        r4.setHostName("sudeep");
        System.out.println("hostname is:"+r4.getHostName());
    }

}

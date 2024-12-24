package com.xworkz.traffic.trafficguidlines;

public class Runner {
    public static void main(String[] args) {

        TrafficGuidelines trafficGuidelines = new BnglrTraffic();
        String ref = trafficGuidelines.followTrafficSignals();
        System.out.println(ref);

        TrafficGuidelines trafficGuidelines1 = new BnglrTraffic();
        String ref1 = trafficGuidelines1.alwaysWearSeatBelt();
        System.out.println(ref1);

        TrafficGuidelines trafficGuidelines2 = new BnglrTraffic();
        String ref2 = trafficGuidelines2.avoidDistractions();
        System.out.println(ref2);

        TrafficGuidelines trafficGuidelines3 = new BnglrTraffic();
        String ref3 = trafficGuidelines3.followRoadSignals();
        System.out.println(ref3);

        TrafficGuidelines trafficGuidelines4 = new BnglrTraffic();
        String ref4 = trafficGuidelines4.maintainLaneDiscipline();
        System.out.println(ref4);

        TrafficGuidelines trafficGuidelines5 = new BnglrTraffic();
        String ref5 = trafficGuidelines5.serviceYourCarRegularly();
        System.out.println(ref5);

    }
}

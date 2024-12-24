package com.xworkz.railwayapp.railwaystation;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.xworkz.railwayapp.BangaloreRailwayStation;
import com.xworkz.railwayapp.Bnglr;
import com.xworkz.railwayapp.RailwayStation;

public class Runner {
    public static void main(String[] args) {

        RailwayStation railwayStation = new BangaloreRailwayStation();
        String ref = railwayStation.tickets();
        System.out.println(ref);

        RailwayStation railwayStation1 = new BangaloreRailwayStation();
        String ref1 = railwayStation1.luggage();
        System.out.println(ref1);

        RailwayStation railwayStation2 = new BangaloreRailwayStation();
        String ref2 = railwayStation2.food();
        System.out.println(ref2);

        RailwayStation railwayStation3 = new BangaloreRailwayStation();
        String ref3 = railwayStation3.smoking();
        System.out.println(ref3);

        RailwayStation railwayStation4 = new BangaloreRailwayStation();
        String ref4 = railwayStation4.boardingStationChanges();
        System.out.println(ref4);

        RailwayStation railwayStation5 = new BangaloreRailwayStation();
        String ref5 = railwayStation5.disturbance();
        System.out.println(ref5);

        RailwayStation railwayStation6 = new BangaloreRailwayStation();
        String ref6 = railwayStation6.safety();
        System.out.println(ref6);

        RailwayStation railwayStation7 = new BangaloreRailwayStation();
        String ref7 = railwayStation7.onlineBoadringStationChanges();
        System.out.println(ref7);

        RailwayStation railwayStation8 = new BangaloreRailwayStation();
        String ref8 = railwayStation8.improvedWaitingHalls();
        System.out.println(ref8);

        RailwayStation railwayStation9 = new BangaloreRailwayStation();
        String ref9 = railwayStation9.improvedWashrooms();
        System.out.println(ref9);

        RailwayStation railwayStation10 = new BangaloreRailwayStation();
        String ref10 = railwayStation10.freeWifi();
        System.out.println(ref10);

        RailwayStation railwayStation11 = new BangaloreRailwayStation();
        String ref11 = railwayStation11.improvedPassengerInformationSystems();
        System.out.println(ref11);

        RailwayStation railwayStation12 = new BangaloreRailwayStation();
        String ref12 = railwayStation12.facilitiesForPeopleWithDisabilites();
        System.out.println(ref12);

        RailwayStation railwayStation13 = new BangaloreRailwayStation();
        String ref13 = railwayStation13.improvedStationAccess();
        System.out.println(ref13);

        RailwayStation railwayStation14 = new BangaloreRailwayStation();
        String ref14 = railwayStation14.improvedEscalators();
        System.out.println(ref14);

    }
}

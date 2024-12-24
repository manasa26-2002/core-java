package com.xworkz.railwayapp;

public class BangaloreRailwayStation implements RailwayStation{


    @Override
    public String tickets() {
        return "tickets must be taken before going into railway station";
    }

    @Override
    public String luggage() {
        return "passengers should bring luggage according to the weight limit";
    }

    @Override
    public String smoking() {
        return "smoking is not permited on platforms,trains or stations";
    }

    @Override
    public String food() {
        return "passengers can either bring their own food or can buy from pantry care";
    }

    @Override
    public String boardingStationChanges() {
        return "there are few restrictions on changing the boarding stations";
    }

    @Override
    public String disturbance() {
        return "passengers cannot be disturbed after 10pm";
    }

    @Override
    public String safety() {
        return "stay behind yellow line at train stations";
    }

    @Override
    public String onlineBoadringStationChanges() {
        return "online boarding station changes are not applicabke for i-ticket";
    }

    @Override
    public String improvedWaitingHalls() {
        return "waiting halls in station should be neat and clean";
    }

    @Override
    public String improvedWashrooms() {
        return "washrooms must be hygeine";
    }

    @Override
    public String freeWifi() {
        return "free wifi should be provided";
    }

    @Override
    public String improvedPassengerInformationSystems() {
        return "every passenger should be provided with correct information";
    }

    @Override
    public String facilitiesForPeopleWithDisabilites() {
        return "people with disabilities should get more facilities";
    }

    @Override
    public String improvedStationAccess() {
        return "improved station access";
    }

    @Override
    public String improvedEscalators() {
        return "escalators and elevators should be improved";
    }
}

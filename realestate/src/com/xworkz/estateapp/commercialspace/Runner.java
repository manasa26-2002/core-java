package com.xworkz.estateapp.commercialspace;

import com.xworkz.estateapp.CommercialSpace;
import com.xworkz.estateapp.FancyStore;

public class Runner {
    public static void main(String[] args) {

        CommercialSpace commercialSpace = new FancyStore();
        int fancyBusiness = commercialSpace.doBusiness();
        System.out.println(fancyBusiness);
    }
}

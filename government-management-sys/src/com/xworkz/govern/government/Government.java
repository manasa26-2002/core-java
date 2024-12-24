package com.xworkz.govern.government;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Government {

    private String state;
    private String partyName;
    private int noOfMlas;
    private String homeMinisterName;

    public void freeEducation(){
        System.out.println("free education  invoked");
        System.out.println("free education for all students under age 15");
    }

    public void getGovernmentInfo(){
        System.out.println("government info:");
        System.out.println("state:"+getState());
        System.out.println("party name:"+getPartyName());
        System.out.println("no of Mlas:"+getNoOfMlas());
        System.out.println("home minister:"+getHomeMinisterName());
    }
}

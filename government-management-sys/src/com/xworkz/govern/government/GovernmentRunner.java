package com.xworkz.govern.government;

import com.xworkz.govern.centralgovernment.CentralGovernment;
import com.xworkz.govern.stategovernment.StateGovernment;

public class GovernmentRunner {
    public static void main(String[] args) {
        Government g1 = new Government();
        g1.setState("karnataka");
        g1.setPartyName("BJP");
        g1.setNoOfMlas(224);
        g1.setHomeMinisterName("G.Parameshwar");
        g1.freeEducation();
        g1.getGovernmentInfo();
        System.out.println("government info:");

        Government g2 =new StateGovernment();
        StateGovernment.isBplCardAvailable=true;
        g2.setState("karnataka");
        g2.setPartyName("congress");
        g2.setHomeMinisterName("G.Parameshwar");
        g2.setNoOfMlas(224);
        g2.freeEducation();
        g2.getGovernmentInfo();
        System.out.println("free education");

        StateGovernment g3 = new StateGovernment();
        StateGovernment.isBplCardAvailable=true;
        g3.freeEducation();
        g3.setState("tamilnadu");
        g3.setPartyName("BJP");
        g3.setHomeMinisterName("M.K.Stalin");
        g3.setNoOfMlas(200);
        System.out.println("............");

        CentralGovernment c1 = new CentralGovernment();
        c1.freeEducation();
        c1.setState("MadhyaPradesh");
        c1.setPartyName("BJP");
        c1.setNoOfMlas(90);
        c1.setHomeMinisterName("Anil Vij");
        c1.getGovernmentInfo();
    }
}

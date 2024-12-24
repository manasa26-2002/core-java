package com.xworkz.medapp.med;

import com.xworkz.medapp.Medicines;

public class MedRunner {
    public static void main(String[] args) {
        Med med = new Med();

        Medicines medicines = new Medicines();
        medicines.setMedName("parecetomol");
        medicines.setMedId("y7890p");
        medicines.setPrice(78.78);

        med.addMedicines(Medicines);
        System.out.println("medicine name is"+medicines.getMedName());
        System.out.println("medicine id is:"+medicines.getMedId());
        System.out.println("meicine price is:"+medicines.getPrice());
    }
}

package com.xworkz.medapp.med;

import com.xworkz.medapp.Medicines;

public class Med {
    Medicines medicines;
    public boolean addMedicines(Medicines medicines){
        boolean isAdded = false;
        if(medicines != null){
            if(medicines.getMedId() > 0 && medicines.getMedName() != null){
                this.medicines = medicines;
                isAdded = true;
            }
        }
        return  isAdded;
    }
}

package com.xworkz.staionary.stall;

import com.xworkz.staionary.items.Items;

public class Stall {
    Items items;

    public boolean addItems(Items items) {
        boolean isAdded = false;
        if (items != null) {
            if (items.getPrice() > 0 && items.getProductName() != null) {
                this.items = items;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public boolean updateProductName(String updateProductName) {
       // boolean isUpdated = false;
        if (updateProductName != null) {
            if (items.getProductName() != null) {
                this.items = items;
               // isUpdated = true;
            }
        }

    }
}

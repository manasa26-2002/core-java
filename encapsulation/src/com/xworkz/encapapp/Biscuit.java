package com.xworkz.encapapp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class Biscuit {

    private String biscuitName;
    private int cost;
    private int quantity;
    private String type;

    @Override
    public String toString(){
        return ""
    }
}

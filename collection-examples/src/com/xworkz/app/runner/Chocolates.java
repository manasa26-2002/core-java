package com.xworkz.app.runner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
    public class Chocolates implements Comparable<Chocolates>{

    private int id;
    private String name;
    private String flavour;
    private int price;

    @Override
    public int compareTo(Chocolates o) {
        return this.getFlavour().compareTo(o.getFlavour());
    }
}

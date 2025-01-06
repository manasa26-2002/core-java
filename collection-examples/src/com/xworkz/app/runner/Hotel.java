package com.xworkz.app.runner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Hotel implements Comparable<Hotel> {

    private int hotelId;
    private String hotelName;
    private String place;

    @Override
    public int compareTo(Hotel o) {
        return this.hotelName.compareTo(o.hotelName);
    }
}

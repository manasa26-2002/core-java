package com.xworkz.bread;

import com.xworkz.bread.slice.Slice;

import java.sql.SQLOutput;

public class SliceRunner {
    public static void main(String [] args){
        Slice s1= new Slice();
        s1.setBrand("amul");
        s1.setNoOfSlices("20");
        s1.setPrice(50);
        s1.setType("wheatbread");
        System.out.println(s1.toString());

        Slice s2 = new Slice();
        s1.setBrand("amul");
        s1.setNoOfSlices("20");
        s1.setPrice(50);
        s1.setType("wheatbread");
        System.out.println(s2.toString());

        boolean ref = s1.equals(s2);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}

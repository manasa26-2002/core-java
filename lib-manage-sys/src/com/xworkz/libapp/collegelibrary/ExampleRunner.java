package com.xworkz.libapp.collegelibrary;

public class ExampleRunner {
    public static void main(String[] args) {

        Object[] obj1 = new Object[2];
        obj1[0]=1;
        obj1[1]=2;

        Object[] obj = new Object[2];
        obj[0] =obj1;

         for(Object o:obj){
             for(Object val :obj){
                 System.out.println((String) val);
             }
         }

    }
}
//classCastException
package com.xworkz.libapp.collegelibrary;

public class Runner {
    public static void main(String[] args)    {

            System.out.println("main started");
            m1();

        System.out.println("main ended");
    }

    private static void m1()    {
        System.out.println("m1 started");
        m2();
        System.out.println("m1 ended");
    }

    private static void m2()   {
        System.out.println("m2 started");

            m3();

        System.out.println("m2 ended");
    }

    private static void m3()   {
        try {
            System.out.println("m3 started");

            String str = null;
            System.out.println(str.length());

            String st = "23456U";
          int intValue =  Integer.parseInt(st);

        }catch(NullPointerException | NumberFormatException e){
            e.printStackTrace();
        }
        System.out.println("m3 ended");
    }

}

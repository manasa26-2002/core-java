package com.xworkz.clock;

import java.util.Scanner;

public class ExceptionRunner {
    public static void main(String[] args) {

        System.out.println("main started");

//        String st = "7634512309";
//
//        long status = Long.parseLong(st);
//        System.out.println("user status is " +status);


        Scanner scanner = new Scanner(System.in);

        Watch watch = new Watch();

        System.out.println("enter the brand of watch");
           String brand =scanner.next();
//            scanner.nextLine();
           watch.setBrand(brand);

        System.out.println("enter the color of watch");
           String color = scanner.next();
           watch.setColor(color);

        System.out.println("enter the price of watch");
           double price = scanner.nextDouble();
           watch.setPrice(price);

        System.out.println(watch);

        Watch w1 = new Watch();
        System.out.println("enter brand name of watch");
        String brand1 = scanner.next();
        w1.setBrand(brand1);

        System.out.println("enter color of watch");
        String color1 = scanner.next();
        w1.setColor(color1);

        System.out.println("enter price of watch");
        double price1 = scanner.nextDouble();
        w1.setPrice(price1);
        System.out.println(w1);

        Watch w2 = new Watch();
        System.out.println("enter brand name of watch");
        String brand2 = scanner.next();
        w2.setBrand(brand2);

        System.out.println("enter color of watch");
        String color2 = scanner.next();
        w2.setColor(color2);

        System.out.println("enter price of watch");
        double price2 = scanner.nextDouble();
        w2.setPrice(price2);
        System.out.println(w2);

        Watch w3 = new Watch();
        System.out.println("enter brand name of watch");
        String brand3 =scanner.next();
        w3.setBrand(brand3);

        System.out.println("enter color of watch");
        String color3 = scanner.next();
        w3.setColor(color3);

        System.out.println("enter price of watch");
        double price3 = scanner.nextDouble();
        w3.setPrice(price3);
        System.out.println(w3);
        
        Watch w4 = new Watch();
        System.out.println("enter brand name of watch");
        String brand4 =scanner.next();
        w4.setBrand(brand4);

        System.out.println("enter color of watch");
        String color4 = scanner.next();
        w4.setColor(color4);

        System.out.println("enter price of watch");
        double price4 = scanner.nextDouble();
        w4.setPrice(price4);
        System.out.println(w4);

        Watch w5 = new Watch();
        System.out.println("enter brand name of watch");
        String brand5 =scanner.next();
        w5.setBrand(brand5);

        System.out.println("enter color of watch");
        String color5 = scanner.next();
        w5.setColor(color5);

        System.out.println("enter price of watch");
        double price5 = scanner.nextDouble();
        w5.setPrice(price5);
        System.out.println(w5);

        Watch w6 = new Watch();
        System.out.println("enter brand name of watch");
        String brand6 =scanner.next();
        w6.setBrand(brand6);

        System.out.println("enter color of watch");
        String color6 = scanner.next();
        w6.setColor(color6);

        System.out.println("enter price of watch");
        double price6 = scanner.nextDouble();
        w6.setPrice(price6);
        System.out.println(w6);

        Watch w7 = new Watch();
        System.out.println("enter brand name of watch");
        String brand7 =scanner.next();
        w7.setBrand(brand7);

        System.out.println("enter color of watch");
        String color7 = scanner.next();
        w7.setColor(color7);

        System.out.println("enter price of watch");
        double price7 = scanner.nextDouble();
        w7.setPrice(price7);
        System.out.println(w7);

        Watch w8 = new Watch();
        System.out.println("enter brand name of watch");
        String brand8 =scanner.next();
        w8.setBrand(brand8);

        System.out.println("enter color of watch");
        String color8 = scanner.next();
        w8.setColor(color8);

        System.out.println("enter price of watch");
        double price8 = scanner.nextDouble();
        w8.setPrice(price8);
        System.out.println(w8);

        Watch w9 = new Watch();
        System.out.println("enter brand name of watch");
        String brand9 =scanner.next();
        w9.setBrand(brand9);

        System.out.println("enter color of watch");
        String color9 = scanner.next();
        w9.setColor(color9);

        System.out.println("enter price of watch");
        double price9 = scanner.nextDouble();
        w9.setPrice(price9);
        System.out.println(w9);

        System.out.println("main ended");
    }
}

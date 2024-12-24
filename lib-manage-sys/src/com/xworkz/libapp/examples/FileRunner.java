package com.xworkz.libapp.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRunner {
    public static void main(String[] args)     {

        System.out.println("main started");
        File file = new File("C:\\Users\\DE\\Desktop\\java.txt");
        
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());

        System.out.println(file.canWrite());
        System.out.println(file.canRead());

        System.out.println("main ended");
    }
}

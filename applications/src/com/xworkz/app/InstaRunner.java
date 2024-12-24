package com.xworkz.app;

import com.xworkz.app.instagram.Insta;

public class InstaRunner {
    public static void main(String [] args){
        Insta ref = new Insta();
        ref.setUserName("maddy");
        System.out.println("username is:"+ref.getUserName());

        Insta ref2 = new Insta();
        ref2.setEmail("maddy@gmail.com");
        System.out.println("mailId is:"+ref2.getEmail());

        Insta ref3 = new Insta();
        ref3.setPassword("maddy@123");
        System.out.println("password is:"+ref3.getPassword());

        Insta ref4 = new Insta();
        ref4.setPhNo(99876054);
        System.out.println("phno is:"+ref4.getPhNo());
    }
}

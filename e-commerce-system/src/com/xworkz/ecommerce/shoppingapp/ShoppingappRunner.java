package com.xworkz.ecommerce.shoppingapp;

import com.xworkz.ecommerce.amazon.Amazon;

public class ShoppingappRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Amazon amazon = new Amazon();
        amazon.logIn("anshu@gmail.com");
        amazon.credit(350);
         System.out.println("email is:"+amazon.getEmail());
        System.out.println("amt credited is:"+amazon.getBalance());
    }
}

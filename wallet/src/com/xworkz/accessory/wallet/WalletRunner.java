package com.xworkz.accessory.wallet;

public class WalletRunner {

    public static void main(String[] args) {

        Wallet w1 = new Wallet();
        w1.setWalletId(22);
        System.out.println("wallet id is:"+w1.getWalletId());

        Wallet w2 = new Wallet();
        w2.setBrand("michale kors");
        System.out.println("wallet brand is:"+w2.getBrand());

        Wallet w3 = new Wallet();
        w3.setColor("black");
        System.out.println("wallet color is:"+w3.getBrand());

        Wallet w4 = new Wallet();
        w4.setPrice(2897.34);
        System.out.println("wallet price is:"+w4.getPrice());
    }
}

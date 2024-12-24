package com.xworkz.gmail.mail;

public class MailRunner {

    public static void main(String[] args) {

        Mail m1 = new Mail();
        m1.setTo("kushi@gamil.com");
        System.out.println(m1.getTo());

        Mail m2 = new Mail();
        m2.setFrom("mansa@gmail.com");
        System.out.println(m2.getFrom());

        Mail m3 = new Mail();
        m3.setSubject("2 days leave");
        System.out.println(m3.getSubject());

        Mail m4 = new Mail();
        m4.setBody("2 days leave for family function");
        System.out.println(m4.getBody());

        Mail m5 = new Mail();
        m5.setDescription("as i want 2 days to attend family function");
        System.out.println(m5.getDescription());
    }
}

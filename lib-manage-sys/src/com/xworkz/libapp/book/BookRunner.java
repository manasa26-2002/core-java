package com.xworkz.libapp.book;

import java.util.ArrayList;
import java.util.Collection;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookId(1);
        book.setBookName("good times");
        book.setLanguage("english");
        book.setAuthorName("thomas");
        book.setPrice(5789.9);

        //System.out.println(book);

        Collection collection = new ArrayList();
        collection.add(book);

        System.out.println(collection);
    }
}

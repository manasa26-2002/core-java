package com.xworkz.app.runner.comparator;

import com.xworkz.app.runner.Book;

import java.util.Comparator;

public class BookIdComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getBookId() - (o2.getBookId());
    }
}

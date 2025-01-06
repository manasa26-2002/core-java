package com.xworkz.app.runner;

import java.util.*;
import java.util.stream.Collectors;

public class BookRunner {

        public static void main(String[] args) {

            List<Book> collection = new ArrayList();
            collection.add(new Book(1,"good times",598,"thomas","english"));
            collection.add(new Book(3,"Harry potter",287,"john","english"));

            Collections.sort(collection);

            System.out.println(collection.stream().sorted(Comparator.comparing(Book::getPrice))
                    .collect(Collectors.toList()));
        }
}

package com.xworkz.app.runner;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryRunner {
    public static void main(String[] args) {


        List<Library> collection = new ArrayList();
        collection.add(new Library(5,"central library",872145896l,"english"));
        collection.add(new Library(9,"Knowledge center",3219865l,"sanskrit"));
        collection.add(new Library(2,"public library",6541865l,"kannada"));
        collection.add(new Library(12,"state library",8631298l,"hindi"));
        collection.add(new Library(10,"Book House",853192309l,"arabic"));

        Collections.sort(collection);

        System.out.println(collection.stream().sorted(Comparator.comparing(Library::getName)).
                collect(Collectors.toList()));

    }
}

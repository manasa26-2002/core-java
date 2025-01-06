package com.xworkz.app.runner.comparator;

import com.xworkz.app.runner.Library;

import java.util.Comparator;

public class NameComparator implements Comparator<Library> {
    @Override
    public int compare(Library o1, Library o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

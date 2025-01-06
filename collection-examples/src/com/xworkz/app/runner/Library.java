package com.xworkz.app.runner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Library implements Comparable<Library> {

    private int id;
    private String name;
    private long noOfBooks;
    private String language;

    @Override
    public int compareTo(Library o) {
        return this.getId() - o.getId();
    }
}

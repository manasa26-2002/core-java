package com.xworkz.app.runner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Book implements Comparable<Book> {

        private int bookId;
        private String bookName;
        private int price;
        private String authorName;
        private String language;


        @Override
        public int compareTo(Book o) {
                return this.getAuthorName() .compareTo(o.getAuthorName());
        }
}

package com.xworkz.libapp.book;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private int bookId;
    private String bookName;
    private double price;
    private String authorName;
    private String language;

    public Book(){

    }

//    public  void
//   public void setBookName(String bookName) {
//        this.bookName = bookName;
//    }
//    public void setAuthorName(String authorName){
//        this.authorName=authorName;
//    }
//    public void setPrice(double price){
//        this.price=price;
//    }
//    public void setLanguage(String language){
//        this.language=language;
//    }

    @Override
    public  String toString(){
         return "book-(bookName = "+this.bookName+" ," +
                "author"+this.authorName +" ," +
                "price"+this.price +"," +
                "language"+this.language+")";
    }

}

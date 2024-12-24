package com.xworkz.libapp.collegelibrary;

import com.xworkz.libapp.book.Book;
import com.xworkz.libapp.exception.AuthorNameNotFoundException;
import com.xworkz.libapp.exception.BookIdNotFoundException;
import com.xworkz.libapp.exception.LanguageNotFoundException;

public class Library {

    Book book[] =null;

    public Library(int size){
        book=new Book[size];
    }
    int index;

    public boolean addbook(Book book){
        boolean isAdded = false;
        if(book != null){
            if(book.getBookName()!= null ){
                this.book[index++] = book;
                isAdded = true;
            }
        }
        return isAdded;
    }

    public  void getBook() {
        System.out.println("book info");
        for(Book book: book){
            if(book != null){
                System.out.println(book);
           }
//            else{
//                System.out.println("no availability");
//            }
        }
    }
    public boolean updateBookPriceById(double updatePrice,int id){
        boolean isPriceUpdated = false;
        try {
            for (Book book1 : book) {
                if (book1.getBookId() == id) {
                    book1.setPrice(updatePrice);
                    isPriceUpdated = true;
                }
            }
            if (isPriceUpdated = false) {
                System.out.println(id + "not found");
            }

        }catch(BookIdNotFoundException b){
            b.printStackTrace();
        }
              return isPriceUpdated;
    }
    public boolean updateBookNameByAuthorName(String bookName,String authorName){
        boolean isBookNameUpdated = false;
        try {
            for (Book ref : book) {
                if (ref.getAuthorName() == authorName) {
                    ref.setBookName(bookName);
                    isBookNameUpdated = true;
                }
            }
            if (isBookNameUpdated = false) {
                System.out.println(authorName + "not found");
            }

        }catch (AuthorNameNotFoundException a){
            a.printStackTrace();
        }
        return isBookNameUpdated;
    }

    public boolean updateBookNameByLanguage(String bookName,String language){
        boolean isBookNameUpdate = false;
        try {
            for (Book book2 : book) {
                if (book2.getLanguage() == language) {
                    book2.setBookName(bookName);
                    isBookNameUpdate = true;
                }
            }
            if (isBookNameUpdate = false) {
                System.out.println(language + "not found");
            }
        }catch (LanguageNotFoundException l){
            l.printStackTrace();
        }
        return isBookNameUpdate;
    }

    public boolean updateLanguageByAuthorName(String language,String authorName){
        boolean isAuthorNameUpdated = false;
        try {
            for (Book book3 : book) {
                if (book3.getAuthorName() == authorName) {
                    book3.setLanguage(language);
                    isAuthorNameUpdated = true;
                }
            }
            if(language==null)
                new LanguageNotFoundException("language not found");
            System.out.println("language not found");

        }catch (AuthorNameNotFoundException a){
            a.printStackTrace();
        }
        return isAuthorNameUpdated;
    }
}

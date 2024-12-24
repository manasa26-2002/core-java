package com.xworkz.libapp.exception;

public class BookIdNotFoundException extends RuntimeException{

    public BookIdNotFoundException(String errorMessage){

        super(errorMessage);

    }
}

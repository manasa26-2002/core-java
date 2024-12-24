package com.xworkz.libapp.exception;

public class AuthorNameNotFoundException extends RuntimeException{

    public AuthorNameNotFoundException(String errorMessage){
        super(errorMessage);
    }
}

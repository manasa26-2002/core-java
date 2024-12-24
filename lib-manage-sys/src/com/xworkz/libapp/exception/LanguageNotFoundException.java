package com.xworkz.libapp.exception;

public class LanguageNotFoundException extends RuntimeException{

    public LanguageNotFoundException(String errorMessage){
        super(errorMessage);
    }
}

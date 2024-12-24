package com.xworkz.calenderapp.exception;

public class StartDateNotFoundException extends RuntimeException{

    public StartDateNotFoundException(String errorMessage){
        super(errorMessage);
    }
}

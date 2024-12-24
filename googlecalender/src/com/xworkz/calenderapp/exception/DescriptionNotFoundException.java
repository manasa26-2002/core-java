package com.xworkz.calenderapp.exception;

public class DescriptionNotFoundException extends RuntimeException{

    public DescriptionNotFoundException(String errorMessage){
        super(errorMessage);
    }
}

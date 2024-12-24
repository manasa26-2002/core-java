package com.xworkz.calenderapp.exception;

public class WhoNotFoundException extends  RuntimeException{

    public WhoNotFoundException(String errorMessage){
        super(errorMessage);
    }
}

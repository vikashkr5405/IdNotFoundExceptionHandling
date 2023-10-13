package com.vikash.IdNotFoundExceptionHandling;

public class IdNotFoundException extends RuntimeException
{

    public IdNotFoundException(String message) {
        super(message);
    }


}

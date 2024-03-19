package com.example.customexceptions.Errors;

public class UserNotFoundException extends  RuntimeException
{
    public UserNotFoundException(String message)
    {
        super(message);
    }
}

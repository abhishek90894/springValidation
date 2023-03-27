package com.validation.springBoot.validationPractice.Exception;

public class userNotFoundException extends RuntimeException{

    public userNotFoundException(String message) {
        super(message);
    }
}

package com.kkm9291.kkm9291springboilerplate.common.exception;

public class InvalidUrlException extends RuntimeException {
    public InvalidUrlException(String message) {
        super(message);
    }
}

package com.kkm9291.kkm9291springboilerplate.common.exception;

public class UserActionRestrictionException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UserActionRestrictionException(String message) {
        super(message);
    }
}

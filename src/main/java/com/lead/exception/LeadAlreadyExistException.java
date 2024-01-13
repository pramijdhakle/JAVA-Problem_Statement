package com.lead.exception;

public class LeadAlreadyExistException extends RuntimeException{

    private final String errorCode;

    public LeadAlreadyExistException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}

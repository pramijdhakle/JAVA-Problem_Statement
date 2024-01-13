package com.lead.exception;

public class LeadNotFoundException extends RuntimeException {

    private final String errorCode;

    public LeadNotFoundException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}

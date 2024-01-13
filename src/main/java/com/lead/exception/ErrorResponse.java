package com.lead.exception;

import java.util.List;

public class ErrorResponse {
    private final String code;
    private final List<String> messages;

    public ErrorResponse(String code, List<String> messages) {
        this.code = code;
        this.messages = messages;
    }

    public String getCode() {
        return code;
    }

    public List<String> getMessages() {
        return messages;
    }
}

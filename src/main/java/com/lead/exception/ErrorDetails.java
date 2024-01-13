package com.lead.exception;

public class ErrorDetails {
    private String status;
    private ErrorResponse errorResponse;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

    @Override
    public String toString() {
        return "Error{" +
                "status='" + status + '\'' +
                ", errorResponse=" + errorResponse +
                '}';
    }

    public ErrorDetails(String status, ErrorResponse errorResponse) {
        this.status = status;
        this.errorResponse = errorResponse;
    }
}

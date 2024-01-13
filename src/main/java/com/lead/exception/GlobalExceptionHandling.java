package com.lead.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandling {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(LeadNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleLeadNotFoundException(LeadNotFoundException ex) {
        ErrorResponse errorResponse = new ErrorResponse(ex.getErrorCode(), Collections.singletonList(ex.getMessage()));
        ErrorDetails errorDetails = new ErrorDetails("error", errorResponse);
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(LeadAlreadyExistException.class)
    public ResponseEntity<ErrorDetails> handleLeadAlreadyExistException(LeadAlreadyExistException ex) {
        ErrorResponse errorResponse = new ErrorResponse(ex.getErrorCode(), Collections.singletonList(ex.getMessage()));
        ErrorDetails errorDetails = new ErrorDetails("error", errorResponse);
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);

    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex) {
        Map<String, String> errorMap = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {
            errorMap.put(error.getField(), error.getDefaultMessage());
        });
        return errorMap;
    }
}

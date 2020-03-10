package com.example.demo.exception;

import java.util.Date;

// this is the response we will send when any exception occurs.
public class ExceptionResponse {

    // we want 3 things to be there in every exception response.
    private Date timestamp;
    private String message;;
    private String details;

    public ExceptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}

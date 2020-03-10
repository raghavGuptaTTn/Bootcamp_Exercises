package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
// makes it return the status code of resource not found.
// else by default, it throws 500 - internal server error.
public class UserNotFoundException extends RuntimeException {
    // we extend runtime exception because its unchecked. while Exception is CHECKED.
    // we should avoid checked exceptions as much as we can.

    public UserNotFoundException(String message) {
        super(message);
    }
}

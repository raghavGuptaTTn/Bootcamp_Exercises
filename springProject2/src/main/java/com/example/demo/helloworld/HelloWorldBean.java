package com.example.demo.helloworld;

import org.springframework.stereotype.Component;

public class HelloWorldBean {

    private String message;

    public HelloWorldBean(String message ){
        this.message = message;
    }

    // doesn't work without getter because jackson uses it.
    public String getMessage() {
        return message;
    }

    // works without setter also
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}

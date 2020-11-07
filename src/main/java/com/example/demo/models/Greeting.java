package com.example.demo.models;

/**
 * Greeting
 */
public class Greeting {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Greeting(String message) {
        this.message = message;
    }

    public Greeting() {
    }

    @Override
    public String toString() {
        return "Greeting [message=" + message + "]";
    }
    
}
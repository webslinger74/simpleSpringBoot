package com.example.stevens.first.boot.exceptions;

public enum ExceptionMessages {
    USER_NOT_FOUND("the user was not found try again");

    private String message;

    ExceptionMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

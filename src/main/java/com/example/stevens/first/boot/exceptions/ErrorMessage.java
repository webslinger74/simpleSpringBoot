package com.example.stevens.first.boot.exceptions;

import java.util.Date;

public class ErrorMessage {
    private String message;
    private Date createdAt;

    public ErrorMessage(String message, Date createdAt) {
        this.message = message;
        this.createdAt = createdAt;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

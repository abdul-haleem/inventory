package com.polaris.inventory.service.response;

import java.io.Serializable;
import java.time.LocalDateTime;

public class APIError implements Serializable{

    private String        userMessage;
    private String        developerMessage;

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public APIError(String userMessage, String developerMessage) {
        this.userMessage = userMessage;
        this.developerMessage = developerMessage;
    }

    @Override
    public String toString() {
        return "APIError{" +
                "userMessage='" + userMessage + '\'' +
                ", developerMessage='" + developerMessage + '\'' +
                '}';
    }
}

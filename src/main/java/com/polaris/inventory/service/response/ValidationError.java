package com.polaris.inventory.service.response;

public class ValidationError extends APIError {
    private String field;
    private String errorString;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getErrorString() {
        return errorString;
    }

    public void setErrorString(String errorString) {
        this.errorString = errorString;
    }

    public ValidationError(String field, String errorString) {
        this("","",field,errorString);
    }

    public ValidationError(String userMessage, String developerMessage, String field, String errorString) {
        super(userMessage, developerMessage);
        this.field = field;
        this.errorString = errorString;
    }
}

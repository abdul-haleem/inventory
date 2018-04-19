package com.polaris.inventory.service.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ServiceResponse<T>  implements Serializable{

    private T data;
    List<APIError> errors;

    public ServiceResponse() {
        errors = new ArrayList<>();
    }

    public ServiceResponse(T data, List<APIError> errors) {
        this.data = data;
        this.errors = errors;
    }

    public ServiceResponse(T data) {
        this.data = data;
        errors = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<APIError> getErrors() {
        return errors;
    }

    public void setErrors(List<APIError> errors) {
        this.errors = errors;
    }

    public void addErrorMessage(String errorMessage, String developerMessage){
        errors.add(new APIError(errorMessage,developerMessage));
    }

    public void addValidationMessage(String field, String error,String userMessage, String developerMessage){
        errors.add(new ValidationError(userMessage,developerMessage,field,error));
    }
}

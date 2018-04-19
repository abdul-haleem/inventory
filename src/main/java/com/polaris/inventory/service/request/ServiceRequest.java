package com.polaris.inventory.service.request;

import java.io.Serializable;

public class ServiceRequest<T> implements Serializable{

    private String username;
    private T entity;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    public ServiceRequest(String username, T entity) {
        this.username = username;
        this.entity = entity;
    }
}


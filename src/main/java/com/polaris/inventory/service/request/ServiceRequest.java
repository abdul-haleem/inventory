package com.polaris.inventory.service.request;

import java.io.Serializable;

public abstract class ServiceRequest implements Serializable{

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}


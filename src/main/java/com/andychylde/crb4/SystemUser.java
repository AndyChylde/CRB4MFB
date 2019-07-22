package com.andychylde.crb4;

import java.io.Serializable;


public abstract class SystemUser implements Serializable {


    private String username, password;



//    Setters and getters............................................

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

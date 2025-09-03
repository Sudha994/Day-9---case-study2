package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private String homeId;
    
    public User() {
        this.name = "Sanjith";
        this.homeId = "HOME-420";
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getHomeId() {
        return homeId;
    }
    
    @Override
    public String toString() {
        return "User [name=" + name + ", homeId=" + homeId + "]";
    }
}

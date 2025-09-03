package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Device {
    private String type;
    private boolean status;
    
    public Device() {
        this.type = "Light";
        this.status = false;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public boolean isStatus() {
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Device [type=" + type + ", status=" + status + "]";
    }
}
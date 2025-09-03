package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutomationService {
    private final User user;
    private final Device device;
    
    @Autowired
    public AutomationService(User user, Device device) {
        this.user = user;
        this.device = device;
    }
    
    public void toggleDevice() {
        device.setStatus(!device.isStatus());
        System.out.println(user.getName() + " toggled " + device.getType());
        System.out.println("New status: " + (device.isStatus() ? "ON" : "OFF"));
        System.out.println();
        System.out.println("User Details: "+user.toString());
        System.out.println("Device Details: "+device.toString());
    }
}

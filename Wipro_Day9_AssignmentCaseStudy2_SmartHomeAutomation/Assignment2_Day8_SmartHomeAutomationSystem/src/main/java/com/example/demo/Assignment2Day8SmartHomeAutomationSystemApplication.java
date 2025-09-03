package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Assignment2Day8SmartHomeAutomationSystemApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		AutomationService automationService = ac.getBean(AutomationService.class);
		automationService.toggleDevice();
		automationService.toggleDevice();
	}

}

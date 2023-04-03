package com.springboot.app;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	 public static void main(String[] args) {
		    ApplicationContext context = SpringApplication.run(Application.class, args);
		    ApiService apiService = context.getBean(ApiService.class);
		    apiService.callApi();
		  }
}


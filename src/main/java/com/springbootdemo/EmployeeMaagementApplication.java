package com.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableWebMvc
@SpringBootApplication
public class EmployeeMaagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMaagementApplication.class, args);
	}
	

}

package com.example.CompanyInc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.CompanyInc.services"})
@SpringBootApplication
public class CompanyIncApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyIncApplication.class, args);
	}

}

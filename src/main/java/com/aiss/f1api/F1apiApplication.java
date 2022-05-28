package com.aiss.f1api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class F1apiApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(F1apiApplication.class, args);
	}

}

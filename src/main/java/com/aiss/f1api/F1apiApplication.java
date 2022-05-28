package com.aiss.f1api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
@ComponentScan
public class F1apiApplication extends SpringBootServletInitializer implements WebMvcConfigurer {
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(F1apiApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(F1apiApplication.class, args);
	}

}

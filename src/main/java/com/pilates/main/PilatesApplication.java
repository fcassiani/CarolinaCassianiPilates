package com.pilates.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan(basePackages = { "com.pilates.main" })
@EnableAutoConfiguration
public class PilatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PilatesApplication.class, args);
	}

}

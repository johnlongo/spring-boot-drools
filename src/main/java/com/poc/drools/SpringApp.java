package com.poc.drools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.poc.drools.config.DroolsAutoConfiguration;

@Configuration
@SpringBootApplication
@Import(DroolsAutoConfiguration.class)
public class SpringApp {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringApp.class, args);
	}
}

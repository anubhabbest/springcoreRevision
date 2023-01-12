package com.jajg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jajg")
public class Config {
	@Bean(name="address")
	public Address getAddress() {
		return(new Address("USA"));
	}
	@Bean(name="student1")
	public Student getStudent() {
		return(new Student());
	}
}

package com.mvc.config;

// This is Note Taker App which is made using Hibernate and Servlet and Runs on Tomcat Apache9 Server

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class SpringConfig {

	@Bean(value = "entityManagerFactory")
	public EntityManagerFactory entityManagerFactory() {
		return Persistence.createEntityManagerFactory("java");
	}

}

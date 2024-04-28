package com.emp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.emp") 	//@ComponentScan(basePackages = "com.emp")888
public class EmployeeConfig {
	
	@Bean     
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		return entityManagerFactory.createEntityManager();
	}
	
	@Bean
	public EntityTransaction getEntityTransaction() {
		return getEntityManager().getTransaction();
	}

}

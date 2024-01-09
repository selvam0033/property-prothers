package com.reno.property.brothers.application.start;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.reno.property.brothers.application.domain.database")
@EnableJpaRepositories(basePackages = {"com.reno.property.brothers.application.repository"})
@ComponentScan({ "com.reno.property.brothers.application.controllers","com.reno.property.brothers.application.dao.impl","com.reno.property.brothers.application.model.mapper"})
public class RenoPropertyBrothersApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenoPropertyBrothersApplication.class, args);
	}
	
	@Bean
	public ModelMapper getModelMapper() { return new ModelMapper(); }
	
	
}

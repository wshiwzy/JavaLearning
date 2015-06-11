package com.firstspringapp.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FirstSpringAppConfig {
	@Bean
	public Helloworld helloworld() {		
		return new Helloworld();
	}

	@Bean
	public Stage stage() {
		return Stage.getInstance();
	}
}

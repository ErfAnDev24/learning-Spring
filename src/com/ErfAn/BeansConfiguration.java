package com.ErfAn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ErfAn")
public class BeansConfiguration {

	@Bean(name = "child1")
	public Child child1() {
		return new Child();
	}
	
	@Bean(name = "child2")
	public Child child2() {
		return new Child();
	}
}

package com.ErfAn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.ErfAn")
@Import(SecondBeanConfiguration.class)
public class BeansConfiguration {

	@Bean(initMethod = "init" , destroyMethod = "destroy")
	public Child child() {
		return new Child();
	}
	
	
}

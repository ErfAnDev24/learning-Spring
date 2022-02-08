package com.ErfAn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.ErfAn")
@Import(SecondChild.class)
public class BeansConfiguration {

	@Bean
	public Child child() {
		return new Child();
	}
	
}

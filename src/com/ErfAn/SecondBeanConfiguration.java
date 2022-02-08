package com.ErfAn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecondBeanConfiguration {

	
	@Bean
	public SecondChild child() {
		return new SecondChild();
	}
}

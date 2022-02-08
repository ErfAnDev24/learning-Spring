package com.ErfAn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecondBeanConfiguration {

	@Bean(initMethod = "init" , destroyMethod = "destroy")
	public SecondChild child2() {
		return new SecondChild();
	}
}

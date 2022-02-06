package com.ErfAn;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean,DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

}

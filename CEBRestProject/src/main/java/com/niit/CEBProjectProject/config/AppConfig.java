package com.niit.CEBProjectProject.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.niit")


public class AppConfig {


//	@Bean(name="viewResolver")
//	public ViewResolver getViewResolver() {
//		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
//		viewResolver.setPrefix("/WEB-INF/views/");
//		viewResolver.setSuffix(".jsp");
//		
//		
//		return viewResolver;
//		
	}



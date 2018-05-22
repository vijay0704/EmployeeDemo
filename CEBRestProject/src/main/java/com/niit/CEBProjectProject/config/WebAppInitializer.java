package com.niit.CEBProjectProject.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer {
	public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**");
}

@Override
protected Class<?>[] getRootConfigClasses() {
	// TODO Auto-generated method stub
	return new Class[] {AppConfig.class};
}

@Override
protected Class<?>[] getServletConfigClasses() {
	// TODO Auto-generated method stub
	return null;
}

@Override
protected String[] getServletMappings() {
	// TODO Auto-generated method stub
	return new String[] {"/"};
}
}

package com.niit.EmployeeDemo.EmpConfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages="com.niit")
@EnableTransactionManagement


public class ConfigEmp {


	@Bean(name="dataSource")

	public DataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("org.h2.Driver");
	    dataSource.setUrl("jdbc:h2:~/test");
	    dataSource.setUsername("sa");
	    dataSource.setPassword("");
	    return dataSource;
	 }

	public Properties getHibernateProperties() {
		Properties myproper=new Properties();
		myproper.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		myproper.setProperty("hibernate.show_sql", "true");
		myproper.setProperty("hibernate.hbm2ddl.auto", "update");
			return myproper;
	}

	@Bean(name="sessionFact")
	@Autowired
	public LocalSessionFactoryBean sessionFactory(DataSource dataSource) 
	{
		LocalSessionFactoryBean sessionFact=new LocalSessionFactoryBean();
		sessionFact.setDataSource(dataSource);
		sessionFact.setHibernateProperties(getHibernateProperties());
		sessionFact.setPackagesToScan("com.niit.EmployeeDemo.EmpModel");
		
		return sessionFact;
	}

	@Bean(name="transactionMyManager")
	@Autowired
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFact) 
	{
		HibernateTransactionManager transactionobj=new HibernateTransactionManager();
		transactionobj.setSessionFactory(sessionFact);
		return transactionobj;


}
}

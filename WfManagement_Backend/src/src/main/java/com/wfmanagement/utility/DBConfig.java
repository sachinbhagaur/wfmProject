package com.wfmanagement.utility;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Component
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages={"com.wfmanagement"})


public class DBConfig {
	
	@Bean(name="dataSource")
	 public DataSource getDataSource() {
		
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("hr");
		dataSource.setPassword("hr");
		return dataSource;
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	     }
	 @Bean(name="sessionFactory")
		public SessionFactory getSessionFactory(){
			Properties properties=new Properties();
			properties.setProperty("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
			properties.setProperty("hibernate.hbm2ddl.auto","update");
			properties.setProperty("hibernate.show_sql","true");
			
			LocalSessionFactoryBuilder builder=new LocalSessionFactoryBuilder(getDataSource());
			builder.addProperties(properties);
			builder.scanPackages("com.wfmanagement.models");
			
			return builder.buildSessionFactory();
		}

		@Bean(name="hibernateTransactionManager")
		@Autowired
		public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory){
			return new HibernateTransactionManager(sessionFactory);
		}
		
		public static java.sql.Connection getConn() {
			return null;
		}

	

}

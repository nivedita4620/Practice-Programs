package com.hibernatedemo.hibernateutil;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.hibernatedemo.entity.Employee;


public class HiberUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory == null)
		{
			// properties is a legacy class (presentt in collection)
			Properties settings = new Properties();
			settings.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			settings.put(Environment.URL,"jdbc:mysql://localhost:3306/hiberdb");
			settings.put(Environment.USER,"root");
			settings.put(Environment.PASS,"root");
			settings.put(Environment.HBM2DDL_AUTO,"create");
			
			Configuration cfg= new Configuration();
			cfg.setProperties(settings);
			
			cfg.addAnnotatedClass(Employee.class);
			
			/*ServiceRegistry --> Interface    serviceRegistry-->Obj    StandardServiceRegistryBuilder-->class*/
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			
			
			/*StandardServiceRegistry serviceRegistry= new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			
			sessionFactory=cfg.buildSessionFactory(serviceRegistry);
			*/
			
			 
		}
		return sessionFactory;
	}
}	
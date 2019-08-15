package com.jitihn.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jitihn.entity.Student;

public class HibernateUtils {
	static SessionFactory factory;
	static {
		 factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
	} 
	
	public static Session getSession() {
		return factory.openSession();
	}
}

package com.jitihn.demo;

import org.hibernate.Session;
import com.jitihn.entity.Student;
import com.jitihn.utils.HibernateUtils;

public class CreateStudent {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSession();
		try {
			Student student = new Student("Kent", "Dodds", "kent@gmail.com");
			session.beginTransaction();
			
			session.save(student);
			session.getTransaction().commit();
			System.out.println("saved");
		} finally {
			System.out.println("finally block");
			session.close();
		}
	}
}

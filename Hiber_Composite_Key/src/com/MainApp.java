package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction t1 = session.beginTransaction();
		Student s1 = new Student();
		s1.setId(1);
		//s1.setName("AA");
		s1.setRollNo(45);
		
		Object o = session.get(Student.class,s1);
		
		Student s2=(Student)o;
		System.out.println(s2.getName());
		//session.save(s1);
		t1.commit();
		session.close();
		System.out.println("Data Loaded sucessfully.....");
		
	}

}

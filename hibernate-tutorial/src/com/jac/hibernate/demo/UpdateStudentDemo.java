package com.jac.hibernate.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.jac.hibernate.demo.entity.Student;

public class UpdateStudentDemo {
	
	public static void main(String[] args) {
		
		// Step A: Create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();		
		
		// Step B: Create session
		Session session = factory.getCurrentSession();		
		
		try {	
			int studentId = 1;
			
			// now get a new session, and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id:" + studentId);
			Student myStudent = session.get(Student.class, studentId);			
			System.out.println("Updating student ...");	
			myStudent.setFirstName("Scoopy");
			
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done! 1st");	
			
			// ---------- new code
			// now get a new session, and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// update email for all students
			System.out.println("Update email for all students");			
			session.createQuery("update Student set email='foo@gmail.com'").executeUpdate();
			
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done! 2nd");	
			
			
		}finally {
			factory.close();
		}				
	}
}

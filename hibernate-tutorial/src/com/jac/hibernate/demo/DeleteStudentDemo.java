package com.jac.hibernate.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.jac.hibernate.demo.entity.Student;

public class DeleteStudentDemo {
	
	public static void main(String[] args) {
		
		// Step A: Create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();		
		
		// Step B: Create session
		Session session = factory.getCurrentSession();		
		
		try {	
		// create studentId
			int studentId = 5;
		
		// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
		
		// retrieve student based on id: primary-key
			System.out.println("\nGetting student with id: " + studentId);
			Student myStudent = session.get(Student.class, studentId);
		
		// delete the student
			System.out.println("Deleting student: " + studentId);
			session.delete(myStudent);			
		
			
		// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done!");			
			
		}finally {
			factory.close();
		}				
	}
}

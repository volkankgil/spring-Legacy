package hibernate.demo;



import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Course;
import entity.Instructor;
import entity.InstructorDetail;
import entity.Review;
import entity.Student;

public class AddCoursesForVolkanDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
	try {			
			
			// start a transaction
			session.beginTransaction();
			
			// get the student mary from database
			int studentId=1;
			Student tempStudent=session.get(Student.class,studentId);
			
			System.out.println("Loaded Student");
			System.out.println("Courses : " +tempStudent.getCourses());
			
			//create more courses
			Course tempCourse1=new Course("Fen Bilgisi");
			Course tempCourse2=new Course("Muzik");
			
			//add student to course
			tempCourse1.addStudent(tempStudent);
			tempCourse2.addStudent(tempStudent);
			
			//save the courses
			session.save(tempCourse1);
			session.save(tempCourse2);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			
			//add clean up code
			session.close();
			
			factory.close();
		}
	}

}
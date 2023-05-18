package hibernate.demo;



import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Course;
import entity.Instructor;
import entity.InstructorDetail;
import entity.Review;
import entity.Student;

public class CreateCoursesAndStudentsDemo {

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
			
			//create a course
			Course tempCourse=new Course("Matematik"); 
		
			//save the course
			System.out.println("Saving the courses");
			session.save(tempCourse);
			System.out.println("Saved the Course : " +tempCourse);
			
			//create the student
			Student tempStudent1=new Student("Volkan","Kebapcigil","volkankgil@gmail.com");
			Student tempStudent2=new Student("Tumay","Kebapcigil","tümaykgil@gmail.com");
			Student tempStudent3=new Student("Marin","Kebapcigil","marinkgil@gmail.com");
			
			//add students to the course
			tempCourse.addStudent(tempStudent1);
			tempCourse.addStudent(tempStudent2);
			tempCourse.addStudent(tempStudent3);
			
			//save the students
			System.out.println("Saving Students");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			System.out.println("Saved students : " +tempCourse.getStudents());
			
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
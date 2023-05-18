package hibernate.demo;



import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Course;
import entity.Instructor;
import entity.InstructorDetail;
import entity.Review;
import entity.Student;

public class CreateCoursesAndReviewsDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
	try {			
			
			// start a transaction
			session.beginTransaction();
			
			//create a course
			Course tempCourse=new Course("Matematik"); 
			
			//add some reviews
			tempCourse.addReview(new Review("You have to work hard!!!!"));
			tempCourse.addReview(new Review("Have some knowledge abour lessons teory"));
			tempCourse.addReview(new Review("Sometimes imagine different way to go solution"));
			
			//save the course .. and leverage the cascade all
			System.out.println("Saving the course");
			System.out.println(tempCourse);
			System.out.println(tempCourse.getReviews());
			
			session.save(tempCourse);
			
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
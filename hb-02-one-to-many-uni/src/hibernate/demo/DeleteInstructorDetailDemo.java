package hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Instructor;
import entity.InstructorDetail;

public class DeleteInstructorDetailDemo {

	public static void main(String[] args) {

		// create session factory
				SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Instructor.class)
										.addAnnotatedClass(InstructorDetail.class)
										.buildSessionFactory();
				
				// create session 
				Session session = factory.getCurrentSession();
				
				try {			
					
					// start a transaction
					session.beginTransaction();

					// get the instructor detail object
					int theId=4;
					InstructorDetail tempInstructorDetail=session.get(InstructorDetail.class,theId);
							
					//print the instructor detail
					System.out.println("tempInstructorDetail: " +tempInstructorDetail);
					
					//print the associated instructor
					System.out.println("the associated Instructor:" + tempInstructorDetail.getInstructor());
					
					// now let's delete the instructor detail
					System.out.println("Deleting temp InstructorDetail: " +tempInstructorDetail);
					//session.delete(tempInstructorDetail);
					
					//remove the associated object reference
					//break bi-directional link
					tempInstructorDetail.getInstructor().setInstructorDetail(null); //instructor sınıfından silme yapmaması için null yapıyoruz.
					session.delete(tempInstructorDetail);
					   
					// commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done!");
				}
				finally {
					//handle connection leak issue
					session.close();
					
					factory.close();
				}
			}

		}

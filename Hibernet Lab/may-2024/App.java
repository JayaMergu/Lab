package com.demo.OneToMany_Bidirection;
import Dao.CourseDao;
import Dao.InstructorDao;
import Entity.Course;
import Entity.Instructor;

public class App {
  public static void main(String[] args) {
	  InstructorDao instructordao=new InstructorDao();
  	CourseDao coursedao=new CourseDao();
  	Instructor instructor=new Instructor("Jaya","Mergu","jaya.mergu@gmail.com");
  	instructordao.saveInstructor(instructor);
  	Course course1=new Course("S.Y.BTECH",instructor);
  	coursedao.saveCourse(course1);
  	Course course2=new Course("T.Y.BTECH",instructor);
  	coursedao.saveCourse(course2);
  	Course course3=new Course("F.Y.BTECH",instructor);
  	coursedao.saveCourse(course3);
  	
  	
  	instructor=instructordao.getInstructor(1);
      System.out.println("Instructor ID:"+instructor.getId()+" "+"Instructor FirstName:"+instructor.getFirstName()+" "+"Instructor LastName:"+instructor.getLastName()+"Instructor email:"+instructor.getEmail());
      
      
  }
}

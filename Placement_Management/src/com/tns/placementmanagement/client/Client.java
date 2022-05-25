package com.tns.placementmanagement.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.placementmanagement.entities.Certificate;
import com.tns.placementmanagement.entities.College;
import com.tns.placementmanagement.entities.Placement;
import com.tns.placementmanagement.entities.Student;
import com.tns.placementmanagement.service.CollegeServiceImpl;
import com.tns.placementmanagement.service.IStudentService;
import com.tns.placementmanagement.service.PlacementServiceImpl;
import com.tns.placementmanagement.service.StudentServiceImpl;

public class Client
{
	
	public static void main(String[] args)
	{
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("JPA-PU");
		
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		Student std1 = new Student();
		Student std2 = new Student();
		Certificate ct1 = new Certificate();
		Certificate ct2 = new Certificate();
		College coll = new College();
		
		Placement place1 = new Placement();
		
		StudentServiceImpl obj1 = new StudentServiceImpl();
		CollegeServiceImpl obj2 = new CollegeServiceImpl();
		PlacementServiceImpl obj3 = new PlacementServiceImpl();
		
		
		
		std1.setSid(103);
		std1.setName("Rajesh");
		//student.setCollege("SPPU");
		std1.setRoll(52);
		std1.setQualification("MCS");
		std1.setCourse("CS");
		std1.setYear(2019);
		//student.setCertificate("PHP");
		std1.setHallTicketNo(136);
		
		System.out.println("data is addend sucessfully.....");
		
		ct1.setCid(103);
		ct1.setCollege(coll);
		ct1.setStudent(std1);
		ct1.setYear(2019);
		std1.setCertificate(ct1);
		
		coll.setClgid(103);
		coll.setCollegename("SPPU");
		coll.setLocation("Pune");
		
		
	
		em.persist(std1);
		em.persist(place1);
		em.getTransaction().commit();
		
		System.out.println("Added successfully.....................................");
		em.close();
		factory.close();
		
//Student student = new Student();
//		
//		IStudentService service = new StudentServiceImpl();
//		
//		
//		//CRUD
//		//Create operation  
//		student.setSid(103);
//		student.setName("Rajesh");
//		//student.setCollege("SPPU");
//		student.setRoll(52);
//		student.setQualification("MCS");
//		student.setCourse("CS");
//		student.setYear(2019);
//		//student.setCertificate("PHP");
//		student.setHallTicketNo(136);
//		service.addStudent(student);
//		System.out.println("data is addend sucessfully.....");
//	    
//		
	}

}

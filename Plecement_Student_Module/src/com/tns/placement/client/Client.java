            /* Student Module Project */

package com.tns.placement.client;

import com.tns.placement.entities.Student;
import com.tns.placement.service.IStudentService;
import com.tns.placement.service.StudentServiceImpl;

public class Client 
{

	public static void main(String[] args)
	{
		//CRUD operation calling Activity 
		Student student = new Student();
		
		IStudentService service = new StudentServiceImpl();
		
		/*
		//CRUD
		//Create operation  
		student.setId(103);
		student.setName("Rajesh");
		student.setCollege("SPPU");
		student.setRoll(52);
		student.setQualification("MCS");
		student.setCourse("CS");
		student.setYear(2019);
		student.setCertificate("PHP");
		student.setHallTicketNo(136);
		service.addStudent(student);
		System.out.println("data is addend sucessfully.....");
	    */
		
		
		
		
		//Retrieve - retrieve the data from database (search) 
		
		student = service.searchStudendByID(102);
		System.out.println("ID is :" +student.getId());
		System.out.println("Roll is :" +student.getRoll());
		System.out.println("College is :" +student.getCollege());
		System.out.println("retrieve data is sucessfully.....");
		
		
		
		/*
		// update :- update the data from database 
		student = service.searchStudendByID(101);
		student.setCollege("SPPU");  // SGBAU -> SPPU
		service.updateStudent(student);
		System.out.println("data is update sucessfully.....");
		*/
		
		/*
		student = service.searchStudendByID(101);
		service.deleteStudent(student);
		System.out.println("data is delete sucessfully......");
		*/
		
		
	     /*
		// delete data using HallTicket Id is optional
		student = service.searchStudendByHallTicket(Id);
		service.deleteStudent(student);
		System.out.println("data is delete sucessfully......" + "/n" + " using HallTicket id ");
		*/
		
	}

}

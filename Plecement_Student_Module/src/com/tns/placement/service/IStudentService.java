package com.tns.placement.service;

import com.tns.placement.entities.Student;

public interface IStudentService 
{
	public Student addStudent(Student student); 
	public Student updateStudent(Student student); 
	public Student searchStudendByID(int id);
	public Student searchStudendByHallTicket(int id); 
	
	public Student addCertificate(Student student); 
	
	public Student updateCertificate(Student student);
	
	public Student deleteStudent(Student student); 
	
}

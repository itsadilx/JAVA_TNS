package com.tns.placement.service;

import com.tns.placement.entities.Student;

public interface IStudentService {
	
	public Student addStudent(Student student);    //create
	public Student updateStudent(Student student);   //update
	public Student searchStudentById(int id);         //Retrieval
	public Student deleteStudent(Student student);    //Delete

}

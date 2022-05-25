package com.tns.placement.repository;

import  com.tns.placement.entities.Student;

public interface IStudentRepository {
	
	public Student addStudent(Student student);    //create
	public Student updateStudent(Student student);   //update
	public Student searchStudentById(int id);         //Retrieval
	public Student deleteStudent(Student student);    //Delete


	public abstract void commitTranscation();
	public abstract void beginTransaction();

}

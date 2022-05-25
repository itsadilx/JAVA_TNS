package com.tns.placement.service;

import com.tns.placement.entities.Student;
import com.tns.placement.repository.IStudentRepository;
import com.tns.placement.repository.IStudentRepositoryImpl;

public class IStudentServiceImpl implements IStudentService{

	private IStudentRepository dao;

	public IStudentServiceImpl() {
	dao = new IStudentRepositoryImpl();	
    }

	@Override
	public Student addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTranscation();
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTranscation();
		return student;
	}

	@Override
	public Student searchStudentById(int id) {
	Student student = dao.searchStudentById(id);
		return student;
	}


	@Override
	public Student deleteStudent(Student student) {
	dao.beginTransaction();
	dao.deleteStudent(student);
	dao.commitTranscation();
    return student;
	}

	

}


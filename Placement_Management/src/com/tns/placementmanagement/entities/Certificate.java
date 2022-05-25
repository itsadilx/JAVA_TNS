package com.tns.placementmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table (name="certificate")
public class Certificate 
{
	@Id
	@Column(name="certificate_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private int year;
	private College college; 
	
	
	@OneToOne(mappedBy="student_id")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="college_id")



	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public College getCollege() {
		return college;
	}


	public void setCollege(College college) {
		this.college = college;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}
	
}

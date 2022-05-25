package com.tns.placementmanagement.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table (name="college")
public class College 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int clgid;
	private User collegeAdmin;
	private String collegename;
	private String location;
	

	@OneToMany(mappedBy="student,placement,certificate",cascade=CascadeType.ALL)

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	
	
	public int getClgid() {
		return clgid;
	}
	public void setClgid(int clgid) {
		this.clgid = clgid;
	}
	public User getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(User collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
	

	
}

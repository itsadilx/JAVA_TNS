package com.tns.placement.client;

import com.tns.placement.entities.College;
import com.tns.placement.service.CollegeServiceImpl;
import com.tns.placement.service.ICollegeService;

public class Client {

	public static void main(String[] args)
	{
		//CRUD Opration Calling Activity 
		
				College college = new College();
				ICollegeService  service  = new CollegeServiceImpl();
				
				

				
				//Create Operation 
				
				college.setId(101);
				college.setCollegeAdmin("Yogesh");
				college.setCollegename("BAMU");
				college.setLocation("Aurangabad");
				
				service.addCollege(college);

	}

}

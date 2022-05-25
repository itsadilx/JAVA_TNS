package com.tns.placement.client;

import java.time.LocalDate;
import  com.tns.placement.entities.Certificate;
import  com.tns.placement.entities.College;
import  com.tns.placement.entities.Placement;
import  com.tns.placement.entities.Student;
import  com.tns.placement.entities.User;
import com.tns.placement.service.ICertificateService;
import com.tns.placement.service.ICertificateServiceImpl;
import com.tns.placement.service.ICollegeService;
import com.tns.placement.service.ICollegeServiceImpl;
import com.tns.placement.service.IPlacementService;
import com.tns.placement.service.IPlacementServiceImpl;
import com.tns.placement.service.IStudentService;
import com.tns.placement.service.IStudentServiceImpl;
import com.tns.placement.service.IUserService;
import com.tns.placement.service.IUserServiceImpl;

public class Client {

	public static void main(String[] args) {
		
	   User user = new User();
		College college = new College();
		Student student = new Student();
		Student student1 = new Student();
		Student student2 = new Student();
		Placement placement = new Placement();
		Placement placement1 = new Placement();
		Placement placement2 = new Placement();
		Certificate certificate = new Certificate();
		Certificate certificate1 = new Certificate();
		Certificate certificate2 = new Certificate();
		
		IUserService service = new IUserServiceImpl();
		ICollegeService service1 = new ICollegeServiceImpl();
		IStudentService service2 = new IStudentServiceImpl();
		IPlacementService service3 = new IPlacementServiceImpl();
		ICertificateService service4 = new ICertificateServiceImpl();
			
		//Create
   	    user.setId(1);
	    user.setName("Ammar");
		user.setPassword("@ammar");
      	user.setType("College Admin");
		
		college.setId(2); 
		college.setCollegeName("UDMS");
		college.setLocation("Aurangabad");
		
		student.setId(1);
		student.setName("Shyam");
		student.setRoll(50);
		student.setQualification("MCA");
		student.setCourse("CS");
		student.setYear(2022);
		student.setHallTicketNo(2111139);
		student1.setId(2);
		student1.setName("Pooja");
		student1.setRoll(60);
		student1.setQualification("MCA");
		student1.setCourse("CS");
		student1.setYear(2022);
		student1.setHallTicketNo(2111148);
		student2.setId(3);
		student2.setName("Yogesh");
		student2.setRoll(70);
		student2.setQualification("MCA");
		student2.setCourse("CS");
		student2.setYear(2022);
		student2.setHallTicketNo(2111144);
		
		placement.setId(1); 
		placement.setName("Shyam");
		LocalDate d1 = LocalDate.of(2022, 12, 1);
		placement.setDate(d1);
		placement.setQualification("MCA"); 
		placement.setYear(2022);
		placement1.setId(2); 
		placement1.setName("Pooja");
		LocalDate d2 = LocalDate.of(2022, 11, 2);
		placement1.setDate(d2);
		placement1.setQualification("MCA"); 
		placement1.setYear(2022);
		placement2.setId(3); 
		placement2.setName("Yogesh");
		LocalDate d3 = LocalDate.of(2022, 9, 3);
		placement2.setDate(d3);
		placement2.setQualification("MCA"); 
		placement2.setYear(2022);
		
		certificate.setId(1);
		certificate.setYear(2023);
		certificate1.setId(2);
		certificate1.setYear(2023);
		certificate2.setId(3);
		certificate2.setYear(2023);
		
		college.setUser(user);
		college.addStudent1(student);
		college.addStudent1(student1);
		college.addStudent1(student2);
		college.addPlacement1(placement);
		college.addPlacement1(placement1);
		college.addPlacement1(placement2);
		college.addCertificate1(certificate);
		college.addCertificate1(certificate1);
		college.addCertificate1(certificate2);
		student.setCertificate(certificate);
		student1.setCertificate(certificate1);
		student2.setCertificate(certificate2);
		certificate.setStudent(student);
		certificate1.setStudent(student1);
		certificate2.setStudent(student2);
		
	    service.addUser(user);
		service1.addCollege(college);
		service2.addStudent(student);
		service2.addStudent(student1);
		service2.addStudent(student2);
		service3.addPlacement(placement);
		service3.addPlacement(placement1);
	    service3.addPlacement(placement2);
		service4.addCertificate(certificate);
		service4.addCertificate(certificate1);
		service4.addCertificate(certificate2);
		System.out.println("Data is created successfully");
		
		//Retrieval
//		user = service.searchUserById(1);
//		System.out.println(user.getName());
//		System.out.println(user.getType());
//		System.out.println(user.getPassword());
//		
//		college = service1.searchCollege(1);
//		System.out.println(college.getUser());
//		System.out.println(college.getCollegeName());
//		System.out.println(college.getLocation());
//		
//		student = service2.searchStudentById(1);
//		System.out.println(student.getName());
//		System.out.println(student.getCollege());
//		System.out.println(student.getRoll());
//		System.out.println(student.getQualification());
//		System.out.println(student.getCourse());
//		System.out.println(student.getYear());
//		System.out.println(student.getCertificate());
//		System.out.println(student.getHallTicketNo());
//		
//		placement = service3.searchPlacement(1);
//		System.out.println(placement.getName());
//		System.out.println(placement.getCollege());
//		System.out.println(placement.getDate());
//		System.out.println(placement.getQualification());
//		System.out.println(placement.getYear());
//		
//		certificate = service4.searchCertificate(1);
//		System.out.println(certificate.getYear());
//		System.out.println(certificate.getCollege());
//		System.out.println("Data is retrieved successfully");
//
//        //Update
//		user = service.searchUserById(1);
//		user.setName("Elizabeth");
//		user.setPassword("@Elizabeth");
//		service.updateUser(user);
//		
//		college = service1.searchCollege(1);
//		college.setCollegeName("Harvard");
//		service1.updateCollege(college);
//		
//		student = service2.searchStudentById(1);
//		student.setName("Selena");
//		student.setQualification("BA");
//		student.setYear(2019);
//		service2.updateStudent(student);
//		
//		placement = service3.searchPlacement(1);
//		placement.setName("Selena");
//		placement.setQualification("BA");
//		LocalDate d4 = LocalDate.of(2019, 8, 6);
//		placement.setDate(d4);
//		placement.setYear(2019);
//		service3.updatePlacement(placement);
//		
//		certificate = service4.searchCertificate(1);
//		certificate.setYear(2019);
//		service4.updateCertificate(certificate);
//		
//		student.setCertificate(certificate);
//		certificate.setStudent(student);
//		System.out.println("Data is updated successfully");
//		
//		//Delete
//		user = service.searchUserById(1);
//		college = service1.searchCollege(2);
//		student = service2.searchStudentById(1);
//		student = service2.searchStudentById(2);
//		student = service2.searchStudentById(3);
//		placement = service3.searchPlacement(3);
//		certificate = service4.searchCertificate(3);
		
//        service.deleteUser(user);
//        service1.deleteCollege(college);
//		service2.deleteStudent(student);
//		service2.deleteStudent(student);
//		service3.deletePlacement(placement);
//		service4.deleteCertificate(certificate);
//		System.out.println("Delete is performed successfully");
	}		
}



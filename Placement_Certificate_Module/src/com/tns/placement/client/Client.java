package com.tns.placement.client;

import com.tns.placement.entities.Certificate;
import com.tns.placement.service.CertificateServiceImpl;
import com.tns.placement.service.ICertificateService;


public class Client {

	public static void main(String[] args)
	{
		//CRUD Opration Calling Activity 
		
		Certificate certificate = new 	Certificate ();
		ICertificateService  service  = new CertificateServiceImpl();
		
		//Create Operation 
		
		/*certificate.setId(101);
		certificate.setYear(2022);
		certificate.toString();
		
		
		service.addCertificate(certificate);
*/
		//Update opration
		
		certificate.setId(102);
		service.updateCertificate(certificate);
		System.out.println("Update is Successful");
		
		//Search opration
		/*
		certificate.setCollegename("BAMU");
		service.searchCollege(101);
		System.out.println("Search is Successful");*/
		
		//Delete opration
	
	/*	college.setCollegename("BAMU");
		service.deleteCollege(101);
		System.out.println("Delete is Successful");*/
	}

}

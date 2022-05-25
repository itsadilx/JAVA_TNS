package com.tns.placementmanagement.service;

import com.tns.placementmanagement.entities.Certificate;
import com.tns.placementmanagement.repository.CertificateRepositoryImpl;
import com.tns.placementmanagement.repository.ICertificateRepository;


public class CertificateServiceImpl implements ICertificateService 
{

	//Step1: Establishing Connection between Service and Repo
		private ICertificateRepository dao;
		
		public  CertificateServiceImpl()
		{
		 dao = new CertificateRepositoryImpl();
		}

	
	
	@Override
	public Certificate addCertificate(Certificate certificate) 
	{
		dao.beginTransaction();
		dao.addCertificate (certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate)
	{
		dao.beginTransaction();
		dao.updateCertificate (certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		
		dao.beginTransaction();
		dao.searchCertificate(id);
		dao.commitTransaction();
		return null;
	}

	@Override
	public Certificate deleteCertificate(int id) {
		dao.beginTransaction();
		dao.deleteCertificate(id);
		dao.commitTransaction();
		return null;
	}

}

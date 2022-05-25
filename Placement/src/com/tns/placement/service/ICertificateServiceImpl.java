package com.tns.placement.service;

import com.tns.placement.entities.Certificate;
import com.tns.placement.repository.ICertificateRepository;
import com.tns.placement.repository.ICertificateRepositoryImpl;

public class ICertificateServiceImpl implements ICertificateService{

	private ICertificateRepository dao;

	public ICertificateServiceImpl() {
	dao = new ICertificateRepositoryImpl();	
    }

	@Override
	public Certificate addCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
	Certificate certificate = dao.searchCertificate(id);
		return certificate;
	}


	@Override
	public Certificate deleteCertificate(Certificate certificate) {
	dao.beginTransaction();
	dao.deleteCertificate(certificate);
	dao.commitTransaction();
       return certificate;
	}

	

}


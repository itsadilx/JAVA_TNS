package com.tns.placementmanagement.service;

import com.tns.placementmanagement.entities.Certificate;

public interface ICertificateService 
{
	public Certificate addCertificate (Certificate certificate);
	public Certificate updateCertificate (Certificate certificate);
	public Certificate searchCertificate (int id);
	public Certificate deleteCertificate (int id);

}

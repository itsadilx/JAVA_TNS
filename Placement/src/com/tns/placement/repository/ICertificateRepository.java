package com.tns.placement.repository;

import com.tns.placement.entities.Certificate;

public interface ICertificateRepository {
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificate(int id);
	public Certificate deleteCertificate(Certificate certificate);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}

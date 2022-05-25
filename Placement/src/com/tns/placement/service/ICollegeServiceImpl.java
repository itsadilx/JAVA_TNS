package com.tns.placement.service;

import com.tns.placement.entities.Certificate;
import com.tns.placement.entities.College;
import com.tns.placement.repository.ICollegeRepository;
import com.tns.placement.repository.ICollegeRepositoryImpl;

public class ICollegeServiceImpl implements ICollegeService{

	private ICollegeRepository dao;

	public ICollegeServiceImpl() {
	dao = new ICollegeRepositoryImpl();	
    }

	@Override
	public College addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College updateCollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College searchCollege(int id) {
	College college = dao.searchCollege(id);
		return college;
	}


	@Override
	public College deleteCollege(College college) {
		dao.beginTransaction();
		dao.deleteCollege(college);
		dao.commitTransaction();
			return college;
		}


	

}


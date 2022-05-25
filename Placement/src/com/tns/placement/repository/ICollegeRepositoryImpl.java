package com.tns.placement.repository;

import javax.persistence.EntityManager;

import com.tns.placement.entities.Certificate;
import com.tns.placement.entities.College;

public class ICollegeRepositoryImpl implements ICollegeRepository{

	private EntityManager entityManager;
	
	public ICollegeRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public College addCollege(College college) {
		entityManager.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		entityManager.merge(college);
		return college;
	}

	@Override
	public College deleteCollege(College college) {
		entityManager.remove(college);
		return college;
	}
	

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
	
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();	
	}

	@Override
	public College searchCollege(int id) {
		College college = entityManager.find(College.class, id);
		return college;
	}

	}

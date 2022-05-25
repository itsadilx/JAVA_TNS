package com.tns.placementmanagement.repository;

import javax.persistence.EntityManager;

import com.tns.placementmanagement.entities.College;

public class CollegeRepositoryImpl implements ICollegeRepository
{
	// Step 1 : Start JPA LifeCycle 
	private EntityManager entityManager;
	public CollegeRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
	// Create Opration - Repository
	
	@Override
	public College addCollege(College college) {
		entityManager.persist(college);
		return null;
	}

	@Override
	public College updateCollege(College college) {
		entityManager.merge(college);
		return college;
	}

	@Override
	public College searchCollege(int id) {
		College college = entityManager.find(College.class,id);
		return  college;
	}

	@Override
	public boolean deleteCollege(int id)
	{
		College college = entityManager.find(College.class, id);
		entityManager.remove(college);
		return false;
	}

	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction()
	{
		entityManager.getTransaction().commit();
		
	}

}

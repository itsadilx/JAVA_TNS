package com.tns.placementmanagement.repository;

import javax.persistence.EntityManager;

import com.tns.placementmanagement.entities.User;

public class UserRepositoryImpl implements IUserRepository
{
	// Step 1 : Start JPA LifeCycle 
	private EntityManager entityManager;
	public UserRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
	// Create Opration - Repository
	@Override
	public User addNewUser(User user)
	{
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user)
	{
		entityManager.merge(user);
				return user;
	}

	@Override
	public User deleteUser(int id)
	{
		User user = entityManager.find(User.class, id);
		entityManager.remove(user);
		return user;
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
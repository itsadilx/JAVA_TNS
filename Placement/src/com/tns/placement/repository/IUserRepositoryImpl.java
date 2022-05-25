package com.tns.placement.repository;

import javax.persistence.EntityManager;

import  com.tns.placement.entities.User;

public class IUserRepositoryImpl implements IUserRepository{

	private EntityManager entityManager;
	
	public IUserRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public User addUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}

	@Override
	public User deleteUser(User user) {
		entityManager.remove(user);
		return user;
	}
	

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public User searchUserById(int id) {
		User user = entityManager.find(User.class, id);
		return user;
	}
	
}

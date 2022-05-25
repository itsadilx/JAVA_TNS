package com.tns.placementmanagement.service;

import com.tns.placementmanagement.entities.User;
import com.tns.placementmanagement.repository.IUserRepository;
import com.tns.placementmanagement.repository.UserRepositoryImpl;

public class UserServiceImpl implements IUserService 
{
	//Step1: Establishing Connection between Service and Repo
	private IUserRepository dao;
	
	public UserServiceImpl()
	{
	 dao = new UserRepositoryImpl();
	}

	// Step 2: service calls to perform CRUD Operation
	
	@Override
	public User addNewUser(User user) {
		dao.beginTransaction();
		dao.addNewUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
		
		return user;
	}

	@Override
	public boolean logOut() {
		
		return false;
	}

	@Override
	public User findUserById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}

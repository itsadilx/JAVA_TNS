package com.tns.placement.service;

import com.tns.placement.entities.User;
import com.tns.placement.repository.IUserRepository;
import com.tns.placement.repository.IUserRepositoryImpl;

public class IUserServiceImpl implements IUserService {

	IUserRepository dao;

	public IUserServiceImpl() {
		dao = new IUserRepositoryImpl();
	}

	@Override
	public User addUser(User user) {
		dao.beginTransaction();
		dao.addUser(user);
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
	public User deleteUser(User user) {
		dao.beginTransaction();
		dao.deleteUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User searchUserById(int id) {
		User user = dao.searchUserById(id);
		return user;
	}

}

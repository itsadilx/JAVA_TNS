package com.tns.placement.repository;

import  com.tns.placement.entities.User;

public interface IUserRepository {

	public User addUser(User user); //C
	public User updateUser(User user); //U
	public User deleteUser(User user); //D
	public User searchUserById(int id); //R
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}

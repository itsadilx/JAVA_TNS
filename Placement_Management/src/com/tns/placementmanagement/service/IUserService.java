package com.tns.placementmanagement.service;

import com.tns.placementmanagement.entities.User;

public interface IUserService 
{
 public User addNewUser (User user);
 public User updateUser (User user);
 public User login (User user);
 public boolean logOut ();
public User findUserById(int i);
 


}
